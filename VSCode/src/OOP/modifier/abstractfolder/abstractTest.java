package OOP.modifier.abstractfolder;
abstract class Player {
	boolean pause;     // 일시정지 상태를 저장하기 위한 변수
	int currentPos;    // 현재 play되고 있는 위치를 저장하기 위한 변수

	Player() {         // 추상클래스도 생성자가 있어야 함
		pause = false;
		currentPos = 0;
	}

	abstract void play(int pos);     // 추상메서드

	abstract void stop();            // 추상메서드

	void play() {
		play(currentPos);
	}

	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}

class MP3Player extends Player {
	void play(int currentPos) {
		/* 조상의 추상메서드를 구현 */
	}
	
	void stop() {
		/* 조상의 추상메서드를 구현 */
	}

	int currentAlbum;     // 현재 재생중인 앨범

	void nextAlbum() {
		//...
	}
	void preAlbum() {
		//...
	}
}

public class abstractTest {
    
}
