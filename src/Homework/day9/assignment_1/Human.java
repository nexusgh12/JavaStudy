package Homework.day9.assignment_1;

class Human implements Runnable {
    private float speed;
    
    Human(){
        this.speed = 10.0f;
    }

    Human(float speed){
        this.speed = speed;
    }

    public float getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "현재 속도 설정된 속도는 " + speed + "입니다.";
    }
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(h1.toString());
        Human h2 = new Human(20.5f);
        System.out.println(h2.toString());
        
    }
}
