package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        return (double)win / (win + lose);
    }

    public void report() {
        System.out.printf("%sの2022年の成績は%d勝%d敗%d分、勝率は%.6fです。\n", name, win, lose, draw, getRate());
    }
}

