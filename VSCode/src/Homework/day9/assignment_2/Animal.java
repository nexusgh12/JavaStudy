package Homework.day9.assignment_2;

public class Animal {

    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location.equals("land") || location.equals("sea") || location.equals("air"))
            this.location = location;
        else
            System.out.println("잘못 입력하셨습니다. land, sea, air 중 한가지를 입력하세요");
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("고양이");
        a1.setLocation("land");
        System.out.printf("'%s'의 장소는 '%s'입니다.%n", a1.getName(), a1.getLocation());

        Animal a2 = new Animal();
        a2.setName("강아지");
        a2.setLocation("lad");
        System.out.printf("'%s'의 장소는 '%s'입니다.%n", a2.getName(), a2.getLocation());
    }
}
