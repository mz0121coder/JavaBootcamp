import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Timmy! Choose a number to count to: ");
        int numberToCountTo = scan.nextInt();

        System.out.println("Great! Here's how it's done");
        for (int i = 0; i <= numberToCountTo; i++) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
