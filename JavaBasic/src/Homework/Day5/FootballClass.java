package Homework.Day5;

import java.security.PrivateKey;
import java.util.Random;

public class FootballClass {
    public static void main(String[] args) {
        String[] t1Players = { "손흥민", "H.케인", "루카스 모우라", "G.로셀소", "O.스킵", "P.호이비에르", "B.데이비스", "E.다이어", "C.로메로", "에메르송",
                "H.요리스" };
        String[] t2Players = { "C.호날두", "E.카바니", "L.쇼", "프레드", "S.맥토미니", "B.페르난데스", "A.완 비사카", "H.맥과이어", "R.바란",
                "V.린델로프", "D.데헤아" };

        Team_Football t1 = new Team_Football("토트넘", "손흥민", t1Players);
        Team_Football t2 = new Team_Football("맨유", "C.호날두", t2Players);

        Football football = new Football(t1, t2);

        football.gameStart();
        football.gameResult();

    }

}

class Player_Football {
    private String playerName;
    private String[] players;

    public Player_Football() {

    }

    public Player_Football(String playerName, String[] players) {
        this.playerName = playerName;
        this.players = players;
    }

    public String getPlayerName() {
        return players[(int) (Math.random() * players.length)];
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

}

class Team_Football extends Player_Football {
    private String teamName;
    private String result;
    private boolean attack = false;
    private boolean defense = false;
    private int score = 0;

    public Team_Football() {

    }

    public Team_Football(String teamName, String playerName, String[] players) {
        super(playerName, players);
        this.teamName = teamName;
    }

    public void randomAttack() {
        Random random = new Random();
        this.attack = random.nextBoolean();
    }

    public void randomDefense() {
        Random random = new Random();
        this.defense = random.nextBoolean();
    }

    public void shooting() {
        randomAttack();
        if (attack) {
            randomDefense();
            if (defense) {
                System.out.printf("[%s]: %s(이)가 슈팅에 실패했습니다.%n", getTeamName(), getPlayerName());
            } else {
                score += 1;
                System.out.printf("[%s]: %s(이)가 득점 했습니다.%n", getTeamName(), getPlayerName());
            }
        } else {
            System.out.printf("[%s]: %s(이)가 공을 빼았겼습니다.%n", getTeamName(), getPlayerName());
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setPlayerName(String teamName) {
        this.teamName = teamName;
    }

}

class Football extends Team_Football {

    private Team_Football t1, t2;
    private Team_Football[] teams;
    private String winner;

    public Football() {

    }

    public Football(Team_Football t1, Team_Football t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.teams = new Team_Football[] { t1, t2 };

    }

    public void gameStart() {
        for (int i = 0; i <= 90; i += (int) (Math.random() * 10)) {
            int selectTeam = (int) (Math.random() * 2);
            System.out.printf("%n[%d 분]%n", i);
            teams[selectTeam].shooting();
        }

        if (t1.getScore() > t2.getScore()) {
            winner = t1.getTeamName();
        } else if (t1.getScore() == t2.getScore()) {
            winner = "무승부";
        } else if (t1.getScore() < t2.getScore()) {
            winner = t2.getTeamName();
        }
    }

    public void gameResult() {
        System.out.println();
        System.out.println("===========[ 경기 종료 ]===========");
        System.out.printf("스코어 [%s] %d : [%s] %d%n%n", t1.getTeamName(), t1.getScore(), t2.getTeamName(),
                t2.getScore());

        if (!winner.equals("무승부")) {
            System.out.printf("===========[ 승리팀은 '%s'입니다. ]===========%n", winner);
        } else {
            System.out.printf("===========[ 경기 결과는 '%s' 입니다. ]===========%n", winner);
        }
    }

}
