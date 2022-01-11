package Homework.Day5;

import java.security.PrivateKey;
import java.util.Random;

public class FootballClass {
    public static void main(String[] args) {

        // 각 팀의 선수 추가
        String[] t1Players = { "손흥민", "H.케인", "루카스 모우라", "G.로셀소", "O.스킵", "P.호이비에르", "B.데이비스", "E.다이어", "C.로메로", "에메르송",
                "H.요리스" };
        String[] t2Players = { "C.호날두", "E.카바니", "L.쇼", "프레드", "S.맥토미니", "B.페르난데스", "A.완 비사카", "H.맥과이어", "R.바란",
                "V.린델로프", "D.데헤아" };

        // 팀 객체 생성(매개 변수 : 팀 이름과 선수 명단)
        Team_Football t1 = new Team_Football("토트넘", t1Players);
        Team_Football t2 = new Team_Football("맨유", t2Players);

        // football 객체 생성(매개 변수 : 각 팀)
        Football football = new Football(t1, t2);

        football.gameStart(); // 게임 시작 : 90분동안 반복문을 통해 random boolean 값을 통해 득점 여부 결정
        football.gameResult(); // 게임 결과 출력 : 게임 최종 스코어 및 결과 출력

    }

}

class Player_Football {
    private String playerName; // 플레이어 이름
    private String[] players; // 선수단 이름이 저장 되는 문자열 배열

    public Player_Football() {
        // 기본 생성자
    }

    public Player_Football(String[] players) {
        this.players = players; // players에 선수단 저장
    }

    public String getPlayerName() {
        return playerName; // 선수 이름을 반환
    }

    public void setPlayerName() {
        // 선수단 배열에서 선수 이름을 랜덤 인덱스로 저장
        this.playerName = players[(int) (Math.random() * players.length)];
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

}

class Team_Football extends Player_Football {
    private String teamName; // 팀 이름
    private boolean attack = false; // 공격 여부 판단 boolean 변수
    private boolean defense = false; //// 수비 여부 판단 boolean 변수
    private int score = 0; // 득점 저장

    public Team_Football() {

    }

    public Team_Football(String teamName, String[] players) {
        super(players);
        this.teamName = teamName;
    }

    public void randomAttack() {
        Random random = new Random(); // 랜덤 boolean값을 생성하기 위한 Random 객체 생성
        this.attack = random.nextBoolean(); // 랜덤 boolean값 생성
    }

    public void randomDefense() {
        Random random = new Random(); // 랜덤 boolean값을 생성하기 위한 Random 객체 생성
        this.defense = random.nextBoolean(); // 랜덤 boolean값 생성
    }

    // 공격 시도 메서드
    public void shooting() {
        setPlayerName(); // 랜덤 플레이어 설정
        randomAttack(); // 공격 여부 실행

        if (attack) { // 공격 시도 성공
            randomDefense(); // 수비 여부 랜덤 생성 실행
            if (defense) { // 수비 여부 확인
                // 수비에 성공했을시
                System.out.printf("[%s]: %s(이)가 슈팅에 실패했습니다.%n", getTeamName(), getPlayerName());
            } else {
                // 수비에 실패했을 시
                score += 1; // 득점
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

    public String getTeamName() {
        return teamName;
    }

    public void setPlayerName(String teamName) {
        this.teamName = teamName;
    }

}

class Football extends Team_Football {

    private Team_Football t1, t2; // 팀 객체
    private Team_Football[] teams; // 팀 배열 추후 팀 랜덤 선택 할떄 사용
    private String winner; // 승리팀 여부 저장 변수

    public Football() {

    }

    public Football(Team_Football t1, Team_Football t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.teams = new Team_Football[] { t1, t2 }; // 팀 랜덤 선택 할때 사용
    }

    public void gameStart() { // 게임 시작
        for (int i = 0; i <= 90; i += (int) (Math.random() * 10)) { // 0~10분 마다 랜덤으로 실행 총 90분 지나면 종료
            int selectTeam = (int) (Math.random() * 2); // 공격 시도할 팀 랜덤으로 선택
            System.out.printf("%n[%d 분]%n", i); // 현재 시간 출력
            teams[selectTeam].shooting(); // 공격 시도
        }

    }

    public void gameResult() {

        // 승리팀 여부 확인
        if (t1.getScore() > t2.getScore()) {
            winner = t1.getTeamName();
        } else if (t1.getScore() == t2.getScore()) {
            winner = "무승부";
        } else if (t1.getScore() < t2.getScore()) {
            winner = t2.getTeamName();
        }

        // 경기 결과 출력
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
