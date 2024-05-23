import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        // Task 1 – Ask the user: how many historical figures will you register?
        // – Store the value.
        int numberOfFigues = scan.nextInt();
        // Task 2 – Create a 2D array with a variable number of rows, and 3 values per
        // row.
        String[][] database = new String[numberOfFigues][3];
        scan.nextLine();
        // Watch out for the nextLine() pitfall.
        /*
         * Task 3
         * for (____) {
         * 
         * System.out.println("\n\tFigure " + (i+1));
         * 
         * System.out.print("\t - Name: ");
         * pick up and store figure's name.
         * 
         * System.out.print("\t - Date of birth: ");
         * pick up and store figure's birthday.
         * 
         * System.out.print("\t - Occupation: ");
         * pick up and store figure's occupation.
         * 
         * System.out.print("\n");
         * 
         * }
         * 
         */
        for (int i = 0; i < numberOfFigues; i++) {
            System.out.println("\n\tFigure " + (i + 1));
            System.out.print("\t - Name: ");
            String name = scan.nextLine();
            database[i][0] = name;

            System.out.print("\t - Date of birth: ");
            String dateOfBirth = scan.nextLine();
            database[i][1] = dateOfBirth;

            System.out.print("\t - Occupation: ");
            String occupation = scan.nextLine();
            database[i][2] = occupation;
        }

        System.out.println("These are the values you stored:");
        // Task 4: call print2DArray.
        print2DArray(database);

        /*
         * Task 5: Let the user search the database by name.
         * If there's a match:
         * print( tab of space Name: <name>)
         * print( tab of space Date of birth: <date of birth>)
         * print( tab of space Occupation: <occupation>)
         * 
         */

        System.out.print("\nWho do you want information on? ");
        String nameToSearch = scan.nextLine();
        searchByName(nameToSearch, database);

        scan.close();
    }

    /**
     * Function name: print2DArray
     * 
     * @param array (String[][])
     * 
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void searchByName(String name, String[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(name)) {
                System.out.println("\tName: " + array[i][0]);
                System.out.println("\tDate of birth: " + array[i][1]);
                System.out.println("\tOccupation: " + array[i][2]);
            }
        }
    }
}
