public class Person {
    private int id;
    private String name;
    protected String description;
    
    Person() {
        this.id = -1;
        this.name = "N/A";
        this.description = "N/A";
    }
    
    // Overloaded Constructors (same function, different params)
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int newId) {
        this.id = newId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getDescription() {
        return description;
    }
    
    // This function will be overrided in the subclass
    // (same function with same params, but with different bodies)
    public void setDescription(String desc) {
        this.description = "Person " + desc;
    }
}