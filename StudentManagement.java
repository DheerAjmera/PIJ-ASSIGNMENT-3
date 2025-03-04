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
