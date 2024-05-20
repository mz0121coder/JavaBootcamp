import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);

        /*
         * Task 1
         * 1. Pick up a username and password from the user.
         */

        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");

        // pick up username
        System.out.print("- Username: ");
        String usernameEntry = scan.nextLine();

        // pick up password
        System.out.print("- Password: ");
        String passwordEntry = scan.nextLine();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            System.out.println("Incorrect, please try again!");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }

        System.out.println("Sign in successful. Welcome!");

        // see Learn the Part for the remaining instructions.

        /*
         * will be useful for task 2
         * 
         * System.out.println("\nIncorrect, please try again!\n");
         * System.out.print("- Username: ");
         * usernameEntry = scan.nextLine();
         * System.out.print("- Password: ");
         * passwordEntry = scan.nextLine();
         * 
         * 
         */

        scan.close();

    }
}
