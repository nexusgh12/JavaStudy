
import Vehicle.Vehicle;

public class OOP {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.globalName = "멍멍이";
        dog.CreateAnimal("male", 2);
        dog.GetAnimal();

        long l = 1000000000l;
        float f = 3.14f;
        double d = 3.14d;
        f = 10.f;
        f = 3.14e3f;


        Product product = new Product();    // 오토바이 1
        Product product2 = new Product();   // 오토바이 2
        Product product3 = new Product();   // 오토바이 3
        Product product4 = new Product();   // 오토바이 4
        Product product5 = new Product();   // 오토바이 5
        Product product6 = new Product();   // 오토바이 6

        System.out.println(product3.price);

        product3.price = 300000;            // 가격 책정
        product3.color = "흰색";
        product3.motorOn();                 // 수동키로 오토바이 켜기
        product3.motorOff();                // 수동키로 오토바이 끄기
        product3.motorOnOff();              // 자동으로 오토바이 켜고 끄기
        product3.motorOnOff();              // 자동으로 오토바이 켜고 끄기
        product3.print2();

    }

}

class Product{
    String color;
    boolean motor = false; 
    int width;
    int height;
    int depth;
    int price;

    void motorOn(){
        this.motor = true;
    }

    void motorOff(){
        this.motor = false;
    }

    boolean motorOnOff(){
        this.motor = !this.motor;
        return this.motor;
    }

    int setPrice(int price) {
        System.out.println("Validation function");
        System.out.println("Database save");
        this.price = price;
        System.out.println(this.price);
        System.out.println("Logging");
        return this.price;
    }

    String print() {
        return "이 오토바이의 색깔은 : " + this.color + " 이고, 이 오토바이의 가격은 : " + this.price + " 입니다.";
    }

    String print(int a) {
        return a + "되는가?";
    }

    String print(int a, int b) {
        return a + "되는가?";
    }

    String print(String a, int b) {
        return a + "되는가?";
    }

    String print(int a, String name, int price, boolean isExists) {
        return a + "되는가?";
    }

    void print2() {
        System.out.println("이 오토바이의 색깔은 : " + this.color + " 이고, 이 오토바이의 가격은 : " + this.price + " 입니다.");
    }
}