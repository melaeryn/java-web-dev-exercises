package exercises;
import java.util.*;

public class hashMapPractice {
    public static void main(String[] args){

        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and id numbers
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                int IDNumber = input.nextInt();
                students.put(IDNumber, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }
    }
}
