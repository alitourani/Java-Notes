public class Zoo {
    
    public static void main(String[] args) {
        System.out.println("Let's check JAVA polymorphism!");
        
        // Dog#1 in simple Inheritence
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound(); // Woof!
        feed(rocky);
        
        System.out.println();
        
        // Animal with Dog instance
        Animal sasha = new Dog();
        sasha.makeSound(); // Woof! again (although an animal, it is an instance of a dog)
        
        System.out.println();
        
        // Change the dog to a cat instance (Polymorphism)
        // [Note] Since it is an Animal, it can morph into Cat or Dog
        sasha = new Cat();
        sasha.makeSound(); // Meow! (it is an instance of a cat)
        feed(sasha);
        
        // Reason? It has been instantiated with the type of a subclass ==> Implicit upcast
        
        // [IMPORTANT] Although it is a Cat now, it does not have access to Cat's functions (like scratch)
        // It is still of type Animal. If we want to have access to them, we must explicitly downcast it.
        
        // Down-Casting:
        ((Cat)sasha).scratch();
        feed(sasha);
        
        System.out.println();
        
        // Some checks with InstanceOf
        boolean isAnimal = sasha instanceof Animal;
        System.out.println("isAnimal? " + isAnimal); // True
        boolean isDog = sasha instanceof Dog;
        System.out.println("isDog? " + isDog); // False
        boolean isCat = sasha instanceof Cat;
        System.out.println("isCat? " + isCat); // True
    }
    
    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("It needs Dog food!");
        }
        else if (animal instanceof Cat) {
            System.out.println("It needs Cat food!");
        }
    }
}