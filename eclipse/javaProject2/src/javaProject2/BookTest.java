package javaProject2;

public class BookTest {
public static void main(String[] args) {
	Book book1 = new Book("B001", "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
	Book book2 = new Book("B002", "�ڹ� ��ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
	Book book3 = new Book("B003", "HTML/CSS", "������", 18000, 2021, "�������ǻ�");
	
	
	System.out.printf("%s\t%s\t\t%s\t%s\t%s\t%s\t%n", "������ȣ", "������","����","����","������","���ǻ�");
	System.out.println("----------------------------------------------------------");
	System.out.println(book1.toString());
	System.out.println(book2.toString());
	System.out.println(book3.toString());
  
	System.out.println();
  
	Magazine mgn1 = new Magazine("M001", "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5);
	Magazine mgn2 = new Magazine("M002", "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7);
	Magazine mgn3 = new Magazine("M003", "���� ����", "������", 18000, 2021, "�������ǻ�", 9);
	
	
	System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%n", "������ȣ", "������","����","����","������","���ǻ�","�����");
	System.out.println("----------------------------------------------------------");
	System.out.println(mgn1.toString());
	System.out.println(mgn2.toString());
	System.out.println(mgn3.toString());
}
	

}