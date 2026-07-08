package Week1.SingleResponsiblePrinciple;
public class SRP{
    public static void main(String[] args){
        students st = new students();
        st.setStudentId(1);
        st.setStudentName("Koneti Dheerajkumar");
        st.setStudentMarks(88.5);
        System.out.println("ID: "+st.getStudentId()+"\nName: "+st.getStudentName()+"\nMarks: "+st.getStudentMarks());
        studnetRepository rep = new studnetRepository();
        rep.saveStudent(st);
        EmailServices em = new EmailServices();
        em.SendMail(st);
    }
}
class students {
    private int StudentId;
    private String StudentName;
    private double StudentMarks;
    public void setStudentId(int var1) {
        if (var1 > 0) {
            this.StudentId = var1;
        } else {
            System.out.println("Student Id Must be Greater than 0");
        }
    }
    public int getStudentId() {
        return this.StudentId;
    }
    public void setStudentName(String var1) {
        this.StudentName = var1;
    }
    public String getStudentName() {
        return this.StudentName;
    }
    public void setStudentMarks(double var1) {
        this.StudentMarks = var1;
    }
    public double getStudentMarks() {
        return this.StudentMarks;
    }
}
class studnetRepository{
    public void saveStudent(students student){
        System.out.println("\nSave Student Name: "+student.getStudentName());
    }
}
class EmailServices{
    public void SendMail(students student){
        System.out.println("\nMail Send to Student Name : "+student.getStudentName());
    }
}