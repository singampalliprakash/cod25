import java.util.HashSet;

public class SimpleSet {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); // Duplicate entry
        students.add("David");

        // Display the elements in the HashSet
        System.out.println("Student Names: " + students);

        // Checking if duplicates are allowed
        if (students.contains("Alice")) {
            System.out.println("Alice is present.");
        }
    }
}
