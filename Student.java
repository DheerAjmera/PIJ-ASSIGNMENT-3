import java.util.Date;
public class Student {
    private String prn;  // Unique ID for each student
    private String name;
    private Date dob;
    private double marks;
    
// Constructor to initialize student details
    public Student(String prn, String name, Date dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

// Getter and Setter methods for encapsulation
    public String getPRN() { return prn; }
    public void setPRN(String prn) { this.prn = prn; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDOB() { return dob; }
    public void setDOB(Date dob) { this.dob = dob; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    // Method to display student details
    public void displayStudent() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}
    
