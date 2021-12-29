public class Animal{
    String globalName;
    int globalAge;
    String globalGender;
    //이름과 나이를 지정해주는 메소드
    void CreateAnimal(String gender, int age){
        globalGender = gender;
        globalAge = age;
        System.out.println("동물을 생성했습니다.");
    }
    //동물의 이름과 나이 출력
    void GetAnimal(){
        System.out.printf("이름: '%s'%n나이: '%d살'%n성별: %s%n", globalName, globalAge, globalGender);
    }
    
}