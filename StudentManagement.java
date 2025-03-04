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

    // Search student by PRN
    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Search student by Name
    public void searchByName() {
        System.out.print("Enter Name to search: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Search student by position in the list
    public void searchByPosition() {
        System.out.print("Enter position (index starting from 0): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < students.size()) {
            students.get(index).displayStudent();
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Update student details
    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                System.out.print("Enter new Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Enter new Marks: ");
                double marks = scanner.nextDouble();
                student.setName(name);
                student.setMarks(marks);
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student by PRN
    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                students.remove(student);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}


     
