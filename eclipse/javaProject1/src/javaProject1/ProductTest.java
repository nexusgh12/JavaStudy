package javaProject1;

public class ProductTest {
public static void main(String[] args) {
    Product prd01 = new Product(1, "��Ʈ��", 1200000, 2021, "�Ｚ");
    Product prd02 = new Product(2, "�����", 300000, 2021, "LG");
    Product prd03 = new Product(3, "���콺", 30000, 2020, "������");

    //System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "��ǰ��ȣ", "��ǰ��", "����", "����", "������");
    //System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "��ǰ��ȣ", "��ǰ��", "����", "����", "������");
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%n", "��ǰ��ȣ", "��ǰ��", "����", "����", "������");
    System.out.println("------------------------------------");
    System.out.println(prd01.toString());
    System.out.println(prd02.toString());
    System.out.println(prd03.toString());
}
}