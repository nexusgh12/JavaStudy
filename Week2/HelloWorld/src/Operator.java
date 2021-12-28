public class Operator {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i--;
        System.out.println(i);
        i = i - 1;
        System.out.println(i);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        i = -10;
        System.out.println(i);

        i = +i;
        System.out.println(i);

        boolean power = false;
        System.out.println(power);
        
        power = !power;
        System.out.println(power);

        power = !power;
        System.out.println(power);

        i = -i;
        System.out.println(i);


    }
}
