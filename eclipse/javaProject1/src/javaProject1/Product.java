package javaProject1;

public class Product {
    private int prdNo;
    private String prdName;
    private int prdPrice;
    private int prdYear;
    private String prdMaker;
    
    Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker){
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
    }

    public String toString(){
        return String.format("%03d\t%s\t%d\t%d\t%s\t", prdNo, prdName, prdPrice, prdYear, prdMaker);
    }
}
