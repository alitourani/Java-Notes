public class Student extends Person {
    private int stdId;
    private boolean hasClass = false;
    
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
    
    @Override
    public void setDescription(String desc) {
        this.description = "Student " + desc;
    }

    // Will not be inherited (private)
    private void hasClasses(boolean flag) {
        this.hasClass = flag;
    }

    // Will not be overridden (it is a final function)
    final void template() {
        System.out.println("Final Class ");
    }
}