public class Loop {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i = 0; i <= 100; i++){
        //     sum = sum + 1;
        // }
        // System.out.println("1~100까지의 합 : " + sum);

        // for(int i = 1; i <= 5; i++){
        //     System.out.println(i);
        // }

        // for (int i = 0; i < 5; i++)
        // {
        //     for (int j = 0; j < i+1; j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // for(int i = 0; i < 10; i++)
        // {
        //     for (int j = 0; j < 10; j++)
        //          System.out.print("*");
        // System.out.println();
        // }

        for(int i = 2; i < 10; i++){
            System.out.printf("---- %d 단 ----\n", i);
            for(int j = 1; j < 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
