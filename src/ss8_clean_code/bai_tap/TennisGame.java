package ss8_clean_code.bai_tap;

public class TennisGame {

    public static String getScore(String namePlayer1, String namePlayer2, int score1, int score2) {
        String score = "";
        MethodInGetScore serviceTennisGame = new MethodInGetScore();
        if (score1 == score2) {
            score = serviceTennisGame.getScore1EqualScore2(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = serviceTennisGame.getScoreMoreOrEqual4(score1, score2);
        } else {
            score = serviceTennisGame.getRemainingScore(score1, score2);
        }
        return score;
    }
}