public class Student {
    private int id;
    private String name;
    
    Student() {
        this.id = -1;
        this.name = "N/A";
    }
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        System.out.println("Inside getName - returning " + name);
        return name;
    }
    
    public void setName(String newName) {
        System.out.println("Inside setName - setting " + newName);
        this.name = newName;
    }
}