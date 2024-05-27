import java.util.Scanner;

public class Hangman {

        public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
                        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
                        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
                        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
                        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
                        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
                        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
                        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
                        "wombat", "zebra" };

        public static String[] gallows = { "+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "|   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|   |\n" +
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a
                                                      // trailing escape
                                                      // character, which also happens to be '\'
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/    |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/ \\  |\n" +
                                        "     |\n" +
                                        " =========\n" };

        private static String word = randomWord();
        private static char[] hiddenWord = word.replaceAll("[a-z]", "_").toCharArray();

        static String misses = "";
        static int gallowsIndex = 0;

        private static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                while (true) {
                        if (gameIsRunning()) {
                                printPlaceholders();
                        } else {
                                finishGame();
                                break;
                        }
                }
        }

        public static String randomWord() {
                int randomIndex = (int) ((Math.random()) * words.length);
                return words[randomIndex];
        }

        public static boolean checkGuess(char guess) {
                return word.contains(String.valueOf(guess));
        }

        public static void updatePlaceholders(char guess) {
                if (checkGuess(guess)) {
                        for (int i = 0; i < word.length(); i++) {
                                if (word.charAt(i) == guess)
                                        hiddenWord[i] = guess;
                        }
                } else {
                        misses += String.valueOf(guess);
                        gallowsIndex++;
                }
        }

        public static void printPlaceholders() {
                System.out.println(gallows[gallowsIndex]);
                System.out.println("Actual word - " + word);
                printHiddenWord();

                if (gameIsRunning()) {
                        printMissedGuesses();
                        System.out.print("Guess:\t");
                        char input = scan.nextLine().charAt(0);
                        updatePlaceholders(input);
                }
        }

        private static void printHiddenWord() {
                System.out.print("Word:\t");
                for (int i = 0; i < hiddenWord.length; i++) {
                        System.out.print(i < hiddenWord.length - 1 ? hiddenWord[i] + " " : hiddenWord[i]);
                }
        }

        public static void printMissedGuesses() {
                System.out.println("\n\nMisses:\t" + misses + "\n");
        }

        public static boolean gameIsRunning() {
                return !String.valueOf(hiddenWord).equals(word) && gallowsIndex < 6;
        }

        public static void finishGame() {
                System.out.println(gallows[gallowsIndex]);
                if (String.valueOf(hiddenWord).equals(word)) {
                        printHiddenWord();
                        System.out.println("\n\nGOOD WORK!");
                } else {
                        System.out.println("RIP!\n");
                        System.out.println("The word was: '" + word + "'");
                }
        }
}
