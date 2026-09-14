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

    System.out.println();

    // Second-level
    StudentAlumni studentAlm = new StudentAlumni();
    studentAlm.setId(3);
    studentAlm.setStdId(1993);
    studentAlm.setName("Allen");
    studentAlm.setStdAlumniId(999);
    studentAlm.setDescription("OldStdDesc");
    System.out.println(
      String.format("New alumni student '%s' with ID '%d', StdId '%d', and AlumniId '%d' created!",
      studentAlm.getName(), studentAlm.getId(),
      studentAlm.getStdId(), studentAlm.getStdId()
      )
    );
    System.out.println("Description Override: " + studentAlm.getDescription());
  }
}
