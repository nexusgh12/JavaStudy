public class ParentBook {
    String name;
    int price;

    public void Print(){
        System.out.println("책의 이름과 가격: " + name + price);
    }

   
    
    public static void main(String[] args) {
        ChildBook child = new ChildBook("나의 라임 오렌지 나무", 10000);
        System.out.println("[구현 결과1]");
        child.Print();
    }
}

 class ChildBook extends ParentBook{
    ChildBook(String name, int price){ //생성자
        this.name = name;
        this.price = price;
    }
}