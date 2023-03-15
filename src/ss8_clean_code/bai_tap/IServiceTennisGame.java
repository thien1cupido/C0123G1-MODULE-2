package ss8_clean_code.bai_tap;

public interface IServiceTennisGame {
    String getScore1EqualScore2(int score1);

    String getScoreMoreOrEqual4(int score1, int score2);

    String getRemainingScore(int score1, int score2);
}
