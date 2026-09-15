import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.FunctionDescriptor;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

public class Main {
    
    public static void main(String[] args) throws Throwable {
        // First log
        System.out.println("Java Foreign Function!");
        
        // Check based on a region of the memory
        try (Arena arena = Arena.ofConfined()) {
            // A linked to call functions from outside the JVM
            final var linker = Linker.nativeLinker();

            // Sample function in C++, etc.
            final var symbolLookup = linker.defaultLookup();

            // Memory segment to access the function in the memory (this case, strlen is a C++ function)
            final var memorySegment = symbolLookup.find("strlen").orElseThrow();

            // Function description to keep the signature of the foreign function
            // Using of(return type, argument to pass)
            final var funcDesc = 
                FunctionDescriptor.of(JAVA_LONG, ADDRESS);
            
            final var methodHandle = linker.downcallHandle(memorySegment, funcDesc);

            // Segment allocation to add the input to the memory
            final var segAlloc = arena.allocateFrom("Sample Input");

            // Calling the foreign function
            final var result = (long) methodHandle.invokeExact(segAlloc);

            System.out.println("Value: " + result);
        }
    }
}