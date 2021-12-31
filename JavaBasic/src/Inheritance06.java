class Parent{
    void display(){System.out.println("부모클래스의 display() 메소드 입니다.");}
}

class Child2 extends Parent{
    void display(){ System.out.println("자식 클래스의 display() 메소드입니다.");}

    void display(String str){System.out.println(str);}
}



public class Inheritance06 {
    public static void main(String[] args) {
        Child2 ch = new Child2();

        ch.display();
        ch.display("오버로딩 된 display()메소드입니다.");
    }
    
}
