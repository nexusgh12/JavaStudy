package Homework.Day5;

public class RSP {
    public static void main(String[] args) {

        Player p1 = new Player("철수");
        Player p2 = new Player("영희");

        Game game = new Game();
        game.battle(p1, p2);
    }
}

class Game {
    static String[] rsp = new String[] { "가위", "바위", "보" };
    String winner;

    public void battle(Player p1, Player p2) {
        System.out.println("가위바위보 게임 시작");
        p1.play();
        p2.play();

        if (p1.getResult() == rsp[0]) {

            if (p2.getResult() == rsp[0]) {
                winner = "무승부";
            } else if (p2.getResult() == rsp[1]) {
                winner = p2.getName();
            } else if (p2.getResult() == rsp[2]) {
                winner = p1.getName();
            }
        } else if (p1.getResult() == rsp[1]) {

            if (p2.getResult() == rsp[0]) {
                winner = p1.getName();
            } else if (p2.getResult() == rsp[1]) {
                winner = "무승부";
            } else if (p2.getResult() == rsp[2]) {
                winner = p2.getName();
            }
        } else if (p1.getResult() == rsp[2]) {

            if (p2.getResult() == rsp[0]) {
                winner = p2.getName();
            } else if (p2.getResult() == rsp[1]) {
                winner = p1.getName();
            } else if (p2.getResult() == rsp[2]) {
                winner = "무승부";
            }
        }

        if (!winner.equals("무승부"))
            System.out.printf("%s : %s  / %s : %s%n%s가 이겼습니다.", p1.getName(), p1.getResult(), p2.getName(),
                    p2.getResult(), winner);
        else
        System.out.printf("%s : %s  / %s : %s%n 게임 결과는 %s입니다.", p1.getName(), p1.getResult(), p2.getName(),
        p2.getResult(), winner);
    }
}

class Player extends Game {

    private String name;
    private String result;

    Player(String name) {
        this.name = name;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public String getName() {
        return this.name;
    }

    public void play() {
        int i = (int) (Math.random() * 3);
        setResult(rsp[i]);

    }

}
