public class StudentAlumni extends Student {
    private int stdAlmId;
    
    StudentAlumni() {
        this.stdAlmId = -2;
    }
    
    public int getStdAlumniId() {
        return stdAlmId;
    }
    
    public void setStdAlumniId(int newStdAlumniId) {
        try {
            this.stdAlmId = newStdAlumniId;
        } catch(Exception e) {
            System.out.println("Invalid stdAlmId " + newStdAlumniId);
        }
    }
    
    @Override
    public void setDescription(String desc) {
        this.description = "Alumni Student " + desc;
    }
}