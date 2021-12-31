import Vehicle.car.sportsCar.McLaren;
import Vehicle.car.sportsCar.*;

public class Package {
    public static void main(String[] args) {
        //McLaren m = new McLaren();
        Ferrari f1 = new Ferrari();
        Ferrari f2 = new Ferrari();
        Ferrari f3 = new Ferrari();

        f1.setName("1번 페라리");
        f2.setName("1번 페라리");
        f3.setName("1번 페라리");

        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.getName());

        f1.setPrice(1000000000);
        f2.setPrice(1100000000);
        f3.setPrice(1200000000);
        System.out.println(f1.getPrice());
        System.out.println(f2.getPrice());
        System.out.println(f3.getPrice());
    }
}
