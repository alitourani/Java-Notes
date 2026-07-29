public class Main {
  public static void main(String[] args) {
    // First log
    System.out.println("Let's check JAVA inheritance!");

    // Accessing superclass
    Person person = new Person();
    person.setId(1);
    person.setName("Alex");
    System.out.println("New person '" + person.getName() +
        "' with ID '" + person.getId() + "' created!");
    
    // Accessing subclass
    Student student = new Student();
    student.setId(2);
    student.setStdId(1992);
    student.setName("Ellen");
    System.out.println("New student '" + student.getName() +
        "' with ID '" + student.getId() + "' and StdId '" +
        student.getStdId() + "' created!");
  }
}
