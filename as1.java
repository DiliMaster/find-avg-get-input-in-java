import java.util.Scanner;

public class as1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting marks input
        System.out.print("Enter your mark in Science: ");
        int mark1 = input.nextInt();

        System.out.print("Enter your mark in Maths: ");
        int mark2 = input.nextInt();

        System.out.print("Enter your mark in English: ");
        int mark3 = input.nextInt();

        // Getting lecture attendance input
        System.out.print("Enter the total number of lecture days: ");
        int lecDate = input.nextInt();

        System.out.print("Enter the number of lectures you attended: ");
        int lecAtdate = input.nextInt();

        // Calculating total and average marks
        int total = mark1 + mark2 + mark3;
        double avg1 = total / 3.0;  // Use 3.0 for accurate decimal division

        // Calculating attendance percentage correctly
        double avg2 = ((double) lecAtdate / lecDate) * 100;  // Cast to double for correct division

        // Checking conditions
        if (avg1 >= 50 && avg2 >= 80) {  // Removed syntax error in condition
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

        input.close(); // Close scanner to avoid memory leaks
    }
}
