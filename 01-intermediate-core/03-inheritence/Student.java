public class Student extends Person {
    private int stdId;
    
    Student() {
        this.stdId = -1;
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