public class Main {

    public static void main(String[] args) {

    }

    public static boolean isNullOrBlank(String input) {
        return input == null || input.isBlank();
    }

    public static boolean incorrectPopulation(int population) {
        return population < 1;
    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            return cityName;
        }
    }

    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();
            return country;
        }
    }

    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int population = scanner.nextInt();
            if (!incorrectPopulation(population)) {
                return population;
            }
        }
    }

}