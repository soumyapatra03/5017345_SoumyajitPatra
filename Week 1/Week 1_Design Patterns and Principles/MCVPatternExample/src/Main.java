// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("John Doe", 1, "A");

        // Create a view for the student
        StudentView studentView = new StudentView();

        // Create a controller to manage the student
        StudentController studentController = new StudentController(student, studentView);

        // Display initial student details
        studentController.updateView();

        // Update student details
        studentController.setStudentName("Jane Doe");
        studentController.setStudentGrade("B");

        // Display updated student details
        studentController.updateView();
    }
}
