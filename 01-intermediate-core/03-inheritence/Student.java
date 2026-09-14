public class Student extends Person {
    private int stdId;
    
    Student() {
        // If you wanna call a particular constructor of the Superclass, as the first command:
        // super(); or super(1, "Alex");

        this.stdId = -1;
        System.out.println("- Constructor Student");
    }
    
    public int getStdId() {
        return stdId;
    }
    
    public void setStdId(int newStdId) {
        try {
            this.stdId = newStdId;
        } catch(Exception e) {
            System.out.println("Invalid StdId " + newStdId);
        }
    }
}