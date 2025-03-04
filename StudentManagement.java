import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentManagement {
    private ArrayList<Student> students; // Stores student records
    private Scanner scanner;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    // Constructor initializes the student list and scanner
    public StudentManagement() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    // Method to add a new student
    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = scanner.next();

        System.out.print("Enter Name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dobStr = scanner.next();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        try {
            Student student = new Student(prn, name, dateFormat.parse(dobStr), marks);
            students.add(student);
            System.out.println("Student added successfully!");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Use dd/MM/yyyy.");
        }
    }
    
    // Method to display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }
