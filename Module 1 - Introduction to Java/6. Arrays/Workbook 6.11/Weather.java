import java.util.Arrays;

public class Weather {
    // The instructions for this workbook are on Learn the Part (Workbook 6.11)

    public static void main(String[] args) {
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    public static double[] celsiusToFahrenheit(double[] temperatures) {
        double[] result = Arrays.copyOf(temperatures, temperatures.length);
        for (int i = 0; i < temperatures.length; i++) {
            result[i] = (temperatures[i] / 5 * 9) + 32;
        }
        return result;
    }

    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for (double recording : temp) {
            System.out.print(recording + " ");
        }
        System.out.print("\n");
    }
}
