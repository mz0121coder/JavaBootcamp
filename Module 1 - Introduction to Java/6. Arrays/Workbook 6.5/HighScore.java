public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] scores = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        System.out.print("Here are the scores: " + scores);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int randomNumber() {
        return (int) (Math.random() * 49999) + 1;
    }
}
