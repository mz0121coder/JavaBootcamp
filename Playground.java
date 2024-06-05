import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playground {
  public static List<String> iterateStrings(int numberOfItems, String[] values) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < numberOfItems; i++) {
      result.add(values[i % values.length]);
    }
    return result;
  }

  public static List<Integer> getHighestLowest(String input) {
    String[] numStrings = input.split(" ");
    int max = Integer.parseInt(numStrings[0]);
    int min = Integer.parseInt(numStrings[0]);

    for (String str : numStrings) {
      int num = Integer.parseInt(str);
      max = Math.max(max, num);
      min = Math.min(min, num);
    }

    return Arrays.asList(max, min);
  }

  public static void main(String[] args) {
    System.out.println(getHighestLowest("23 3 32 67 123 2"));
    System.out.println(iterateStrings(5, new String[] { "blue", "red" }));
    System.out.println(iterateStrings(1, new String[] { "one", "two", "three" }));
  }
}
