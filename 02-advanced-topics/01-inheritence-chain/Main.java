public class Main {
  public static void main(String[] args) {
    // First log
    System.out.println("Let's check JAVA inheritance!");
    
    // Superclass
    Person person = new Person();
    person.setId(1);
    person.setName("Alex");
    person.setDescription("PrsDesc");
    System.out.println("New person '" + person.getName() +
        "' with ID '" + person.getId() + "' created!");
    System.out.println("Description: " + person.getDescription());
    
    System.out.println();

    // Subclass
    Student student = new Student();
    student.setId(2);
    student.setStdId(1992);
    student.setName("Ellen");
    student.setDescription("StdDesc");
    System.out.println("New student '" + student.getName() +
        "' with ID '" + student.getId() + "' and StdId '" +
        student.getStdId() + "' created!");
    System.out.println("Description Override: " + student.getDescription());
  }
}
