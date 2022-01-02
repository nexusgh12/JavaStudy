package Homework.Day5;

import java.security.PrivateKey;

public class FootballClass {
    public static void main(String[] args) {
        //Football f1 = new Football("한국", "손흥민");

        //f1.play();

        Team_Football t1 = new Team_Football("토트넘", "손흥민");
        Team_Football t2 = new Team_Football("울버햄튼", "황희찬");

        Football football = new Football(t1, t2);

        football.gameResult();
        
    }

}

class Player_Football {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player_Football() {

    }

    public Player_Football(String playerName) {
        this.playerName = playerName;
    }
}

class Team_Football extends Player_Football {
    private String teamName;
    private String result;
    static String[] rsp = new String[] { "가위", "바위", "보" };

    public String getTeamName() {
        return teamName;
    }

    public void setPlayerName(String teamName) {
        this.teamName = teamName;
    }

    public Team_Football() {

    }

    public Team_Football( String teamName, String playerName) {
        super(playerName);
        this.teamName = teamName;
    }

    public void play() {
        int i = (int) (Math.random() * 3);
        setResult(rsp[i]);
        System.out.printf("%s - %s : %s%n", getTeamName(), getPlayerName() , getResult());
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}

class Football extends Team_Football {

    private Team_Football t1, t2;
    private String winner;

    public Football() {

    }

    public Football(Team_Football t1, Team_Football t2) {
        this.t1 = t1;
        this.t2 = t2;

        this.t1.play();
        this.t2.play();

    }

    public void gameResult(){
        if (t1.getResult() == rsp[0]) {
            if (t2.getResult() == rsp[0]) {
                winner = "무승부";
            } else if (t2.getResult() == rsp[1]) {
                winner = t2.getTeamName();
            } else if (t2.getResult() == rsp[2]) {
                winner = t1.getTeamName();
            }
        } else if (t1.getResult() == rsp[1]) {

            if (t2.getResult() == rsp[0]) {
                winner = t1.getTeamName();
            } else if (t2.getResult() == rsp[1]) {
                winner = "무승부";
            } else if (t2.getResult() == rsp[2]) {
                winner = t2.getTeamName();
            }
        } else if (t1.getResult() == rsp[2]) {

            if (t2.getResult() == rsp[0]) {
                winner = t2.getTeamName();
            } else if (t2.getResult() == rsp[1]) {
                winner = t1.getTeamName();
            } else if (t2.getResult() == rsp[2]) {
                winner = "무승부";
            }
        }

        if (!winner.equals("무승부"))
            System.out.printf("승리팀은 %s입니다.",  winner);
        else
        System.out.printf("게임 결과는 %s입니다.",  winner);
    }

}



