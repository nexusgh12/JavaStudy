
public class Inheritance {
    public static void main(String[] args) {
        
        //Mother mother = new Mother();
        Son son = new Son();

        son.printMotherAge();
        son.setBloodType("A");

        System.out.println(son.getBloodType());
    }
}

class Mother {
    int motherAge = 50;
    String hometown = "경상도";
    boolean isMarried = true;
    String bloodType = "O";

    
    public Mother(){
        System.out.println("welcome to super class");
    }
}

class Son extends Mother{
    int sonAge = 23;
    String hometown = "서울";

    public Son(){
        System.out.println("Welcome to sub class");
    }
    
    public void printMotherAge(){
        System.out.println("Mother's Age : " + super.motherAge);
    }

    public String getBloodType(){
        return this.bloodType;
    }
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
}


