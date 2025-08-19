import java.util.ArrayList;
import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    String department;
    Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + ", Dept=" + department + "]";
    }
}
class Faculty {
    int id;
    String name;
    String department;
    String designation;
    Faculty(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }
    public String toString() {
        return "Faculty[ID=" + id + ", Name=" + name + ", Dept=" + department + ", Designation=" + designation + "]";
    }
}
class Result {
    int studentId;
    String subject;
    double marks;
    Result(int studentId, String subject, double marks) {
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
    }
    public String toString() {
        return "Result[StudentID=" + studentId + ", Subject=" + subject + ", Marks=" + marks + "]";
    }
}
public class CollegeManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Faculty> faculties = new ArrayList<>();
    static ArrayList<Result> results = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Add Student Result");
            System.out.println("4. View Students");
            System.out.println("5. View Faculties");
            System.out.println("6. View Results");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addFaculty();
                    break;
                case 3:
                    addResult();
                    break;
                case 4:
                    viewStudents();
                    break;
                case 5:
                    viewFaculties();
                    break;
                case 6:
                    viewResults();
                    break;
                case 7:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student department: ");
        String dept = scanner.nextLine();
        students.add(new Student(id, name, age, dept));
        System.out.println("Student added successfully.");
    }
    static void addFaculty() {
        System.out.print("Enter faculty ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter faculty name: ");
        String name = scanner.nextLine();
        System.out.print("Enter faculty department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter faculty designation: ");
        String designation = scanner.nextLine();
        faculties.add(new Faculty(id, name, dept, designation));
        System.out.println("Faculty added successfully.");
    }
    static void addResult() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.id == studentId) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found! Please add the student first.");
            return;
        }
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();
        results.add(new Result(studentId, subject, marks));
        System.out.println("Result added successfully.");
    }
    static void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
    static void viewFaculties() {
        System.out.println("\n--- Faculty List ---");
        if (faculties.isEmpty()) {
            System.out.println("No faculties found.");
            return;
        }
        for (Faculty f : faculties) {
            System.out.println(f);
        }
    }
    static void viewResults() {
        System.out.println("\n--- Student Results ---");
        if (results.isEmpty()) {
            System.out.println("No results found.");
            return;
        }
        for (Result r : results) {
            System.out.println(r);
        }
    }
}

