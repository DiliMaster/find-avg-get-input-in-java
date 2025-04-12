import java.util.Scanner;

public class as3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        // Applying ternary operator correctly
        int bonus = (salary > 30000) ? 6000 : (salary > 20000) ? 4000 : 1000;

        // Displaying the total salary including the bonus
        System.out.println("Your total salary is: " + (salary + bonus));

        input.close(); // Closing Scanner to prevent resource leak
    }
}
