import java.util.Set;
import java.util.List;
import java.util.Deque;
import java.util.Queue;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    System.out.println("Working with DataStructures in Java");
    
    // Things to consider for picking data structures:
    // I. Size (fixed, dynamic)
    // II. Duplicates (true, false)
    // III. Order of elements (important, not important)
    // IV. Performance (memory important, memory not important)
    
    // Array, like A fixed array of Strings (only)
    String[] workdays = new String[5];
    workdays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri"};
    System.out.println("Before toString (non-readable): " + workdays);
    System.out.println("After toString (readable): " + Arrays.toString(workdays));
    
    // Iterate over the array
    for (String day : workdays) {
        System.out.println("- Weekday: " + day.toUpperCase());
    }
    
    // Collections:
    // - List (and ArrayList)
    ArrayList menu = new ArrayList<>();
    // - Queue (and PriorityQueue)
    // - Set (and HashSet)
    // Cover: add(), clear(), remove(), size(), isEmpty(), contains()
    
    // LinkedList; lists that have access to their previous and next elements
    LinkedList<String> shoppingList = new LinkedList<>();
    shoppingList.add("banana");
    shoppingList.add("milk");
    shoppingList.add("eggs");
    System.out.println("Shopping List: " + shoppingList);
    // Now, adding an item before milk and after banana
    shoppingList.add(1, "mango"); // At index:1, element:"mango"
    System.out.println("Shopping List with add-at-index: " + shoppingList);
    // Removing items
    shoppingList.removeFirst();
    System.out.println("Shopping List with removeFirst: " + shoppingList);
    // Synchronizing
    List<String> syncedShoppingList = Collections.synchronizedList(shoppingList);
    System.out.println("Shopping List Synced: " + shoppingList);
    
    // Array of Classes
    ArrayList<Student> people = new ArrayList<>();
    Student std1 = new Student(1, "Alex");
    Student std2 = new Student(2, "Mary");
    people.add(std1);
    people.add(std2);
    System.out.println("People List: " + people);
    
    // Stacks and Deques
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First req");
    stack.push("Second req");
    stack.push("Third req");
    System.out.println("Stack: " + stack);
    System.out.println("Stack Peek: " + stack.peek());
    stack.pop();
    System.out.println("Stack after Pop: " + stack);
    
    // Queue
    Queue<String> queue = new ArrayDeque<>();
    queue.offer("Person 1");
    queue.offer("Person 2");
    queue.offer("Person 3");
    System.out.println("Queue: " + queue);
    System.out.println("Queue Peek: " + queue.peek());
    queue.poll();
    System.out.println("Queue after Poll: " + queue);
    // We can use LinkedList or PriorityQueue instead of ArrayDeque
    // If PriorityQueue, the retrieval is lower (alphabetically or number value)
    
    // Tree Sets --> Ordered with no duplicates
    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(20);
    treeSet.add(15);
    treeSet.add(6);
    // By printing we can see it is always ordered
    System.out.println("TreeSet: " + treeSet);
    // Add a duplicate
    treeSet.add(6);
    treeSet.add(6);
    System.out.println("TreeSet after Adding Duplicates: " + treeSet);
    
    Set<String> wordSet = new TreeSet<>();
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("lion");
    // By printing we can see it is always ordered
    System.out.println("WordSet: " + wordSet);
    
    // We can modify the ordering rule, like length
    // ... = new TreeSet<>(Comparator.comparing(String::length));
    // IMPORTANT: This way, if you enter another item with the same length, it will be considered as duplicate
  }
}
