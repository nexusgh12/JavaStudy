package Homework.Day5;

//과제 1~4의 내용입니다.

public class Assignment1 {
    public static void main(String[] args) {
        //인스턴스 생성 및 객체화
        Nation nation = new Nation();
        SouthKorea korea = new SouthKorea();
        Japan japan = new Japan();
        UnitedStatesOfAmerica usa = new UnitedStatesOfAmerica();

        //메소드 호출 및 매개변수 입력
        korea.setIsWar(true);
        japan.setIntensity(7.2f);
        usa.setGDP(20.94f);

        //메소드 호출
        korea.print();
        japan.print();
        usa.print();

    }
}

class Nation{

    //과제1)
    //멤버 변수 선언
    private String name;
    
    //과제3) 접근제어
    public float area;
    public int population;

    //과제4) 행성 이름 만들고 static으로 지정
    static String planetName = "Earth";

    //Set 메소드 선언
    public void setName(String name){
        this.name = name;
    }

    public void setArea(float area){
        this.area = area;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    //getter 선언
    public String getName() {
        return name;
    }

    public float getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public void print(){
        System.out.println("국가 이름 : " + getName() + " 면적 : " + getArea() + " 인구 : " + getPopulation());
    }
}

//과재2)
class SouthKorea extends Nation{

    //멤버 변수 선언
    boolean isWar; //전쟁 중 인지 여부 확인 변수

    //생성자 선언

    public SouthKorea(){
        super.setName("한국");
        super.setArea(100210);
        super.setPopulation(51780000);
    }

    //메소드 선언
    public void setIsWar(boolean isWar){
        this.isWar = isWar;
    }
    
    

}

class Japan extends Nation{

    //멤버 변수 선언
    float intensity; //지진의 진도 변수


    //생성자 선언

    public Japan(){
        super.setName("일본");
        super.setArea(377975);
        super.setPopulation(125800000);
    }

    //메소드 선언
    public void setIntensity(float intensity){
        this.intensity = intensity;
    }

}

class UnitedStatesOfAmerica  extends Nation{

    //멤버 변수 선언
    float GDP; //전쟁 중 인지 여부 확인 변수

    //생성자 선언
    public UnitedStatesOfAmerica(){
        super.setName("미국");
        super.setArea(9834000);
        super.setPopulation(329500000);
    }

    //메소드 선언
    public void setGDP(float GDP){
        this.GDP = GDP;
    }

}

