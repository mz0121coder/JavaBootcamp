import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);

        int randomInt = (int) (Math.random() * 5) + 1;
        int userChoice = scan.nextInt();

        while (userChoice != randomInt) {
            System.out.println(userChoice);
            System.out.println(randomInt);
            System.out.print("Guess again: ");
            userChoice = scan.nextInt();
        }

        System.out.println("You got it!");

        scan.close();
    }

}
