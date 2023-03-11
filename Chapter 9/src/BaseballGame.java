public class BaseballGame {
    private String nameOne;
    private String nameTwo;
    private int[][] scores = new int[2][9];
    private final int INNINGS = 9;

    public BaseballGame() {
        this.nameOne = " ";
        this.nameTwo = " ";

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                this.scores[row][col] = 0;
            }
        }
    }

    public BaseballGame(String nameOne, String nameTwo, int[][] scores) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        this.scores = scores;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public void setScore(int score, int team,int inning) {
        this.scores[team-1][inning-1]=score;
    }

    public int getScore(int team,int inning)
    {
        return scores[team-1][inning-1];
    }
}
