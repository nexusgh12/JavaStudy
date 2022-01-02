package Homework.Day5;

import java.util.Scanner;

//과제6)
public class Assignment3 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerSwitch();
    }
}

class Computer{
    private boolean power = false;
    private int price;


    public int getPrice() {
        return price;
    }


    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean getIsPower() {
        return power;
    }

    Computer(){
        System.out.println("컴퓨터가 제작되었습니다.");
        CPU cpu = new CPU("i9-12900k", "Intel", 750000);
        GPU gpu = new GPU("RTX-3070ti", "NVIDIA", 1400000);
        Mainboard mainboard = new Mainboard("Z690", "ASUS", 400000);
        Ram ram = new Ram("DDR5-6200", "Hynix", 500000);
        Disk disk = new Disk("980 Pro", "Samsung", 250000);
        Power power = new Power("1000W Titanuim", "Antec", 300000);
        price = cpu.getPrice() + gpu.getPrice() + mainboard.getPrice() + ram.getPrice() + 
        disk.getPrice() + power.getPrice() ;
    }

    public void powerSwitch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("컴퓨터의 전원을 켜겠습니까?(y/n)> ");
        String yn = scanner.nextLine();
        if(yn.equals("y")){
            System.out.println("컴퓨터의 전원이 켜졌습니다.");
            setPower(true);
        }
        else if(yn.equals("n")){
            System.out.println("컴퓨터의 전원이 꺼졌습니다.");
            setPower(false);
        }
    }
}

 class Parts{
    private String name;
    private int price;
    private String brand;
    private String type;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpec(String name, String brand, int price){
        setBrand(brand);
        setName(name);
        setPrice(price);
    }
    public void showSpec(){
        System.out.printf("%s: %s %s%n", type, brand, name);
    }
}

class CPU extends Parts {
    CPU(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("CPU");
        showSpec();
    }    
}

class GPU extends Parts {
    GPU(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("GPU");
        showSpec();
    }    
}

class Ram extends Parts {
    Ram(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("Ram");
        showSpec();
    }    
}

class Power extends Parts {
    Power(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("Power");
        showSpec();
    }    
}

class Mainboard extends Parts {
    Mainboard(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("Mainboard");
        showSpec();
    }    
}

class Disk extends Parts {
    Disk(String name, String brand, int price){
        setSpec(name, brand, price);
        setType("Disk");
        showSpec();
    }    
}

