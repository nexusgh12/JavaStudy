public class ProductTest {
    public static void main(String[] args) {
        Product prd01 = new Product(1, "노트북", 1200000, 2021, "삼성");
        Product prd02 = new Product(2, "모니터", 300000, 2021, "LG");
        Product prd03 = new Product(3, "마우스", 30000, 2020, "로지텍");

        //System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "상품번호", "상품명", "가격", "연도", "제조사");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "상품번호", "상품명", "가격", "연도", "제조사");
        System.out.println("-------------------------------------------");
        System.out.println(prd01.toString());
        System.out.println(prd02.toString());
        System.out.println(prd03.toString());

    }
}
