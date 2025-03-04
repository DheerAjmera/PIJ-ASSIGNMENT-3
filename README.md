# PIJ-ASSIGNMENT-3
# Student-Management-System
A menu-driven Java application that demonstrates classes, objects, constructors, instance members, and arrays/ArrayLists.

This program allows users to manage student records by performing operations like adding, displaying, searching, updating, and deleting student details.

# Student Management System (Java)
##  Project Description
This is a menu-driven Java program that allows users to manage student records efficiently. The system provides functionality to:

- Add a student
- Display all students
- Search for a student by PRN, Name, or Position
- Update student details
- Delete a student record
  
#The program follows object-oriented programming (OOP) principles using:

- Classes and Objects
- Constructors
- Instance members
- Array of objects
- Project Structure

  
#Feature Description

1) Add Student Allows user to enter student details (PRN, Name, DOB, Marks)
2) Display All Students Lists all student records
3) Search by PRN Finds and displays a student using PRN
4) Search by Name Finds and displays a student using Name
5) Search by Position Fetches a student record by index
6) Update Student Updates student name and marks using PRN
7) Delete Student Deletes a student record using PRN
8) Exit Closes the application

#Code Explanation

1) Student.java Defines the Student class with attributes: prn (String) name (String) dob (Date) marks (double) Contains getter and setter methods. displayStudent() prints student details.
2) StudentManagement.java Uses an array of Student objects to store records. Implements functions: addStudent() displayAllStudents() searchByPRN() searchByName() searchByPosition() updateStudent() deleteStudent()
3) Main.java Provides a menu-driven interface. Calls functions from StudentManagement.java based on user input.
