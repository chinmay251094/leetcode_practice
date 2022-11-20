package DataFiles;

public class CalculateScore {
    public static void main(String[] args) {
        int pos = calculateHighScorePosition(1010);
        displayHighScorePosition("Komal", pos);
        pos = calculateHighScorePosition(1000);
        displayHighScorePosition("Chinmay", pos);
        pos = calculateHighScorePosition(423);
        displayHighScorePosition("Kuldip", pos);
        pos = calculateHighScorePosition(74);
        displayHighScorePosition("David", pos);
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;

    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into " + position + " on the high score table.");
    }
}
