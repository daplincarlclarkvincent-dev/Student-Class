public class Main {
    public static void main(String[] args) {

        // Create a Student object
        Student student1 = new Student();

        // Set student details
        student1.setDetails("Juan Dela Cruz", 18, 85.5);

        // Call methods and display results
        System.out.println("Student Name: " + student1.getName());
        student1.displayInfo();
    }
}
