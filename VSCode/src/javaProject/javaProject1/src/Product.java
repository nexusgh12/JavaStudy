public class Product {
    private int prdNo;
    private String prdName;
    private int prdPrice;
    private int prdYear;
    private String prdMaker;
    private int i = 8;
    Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker){
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
    }

    public String toString(){
        return String.format("%03d\t  %-6s%-8d%-8d%-6s", prdNo, prdName, prdPrice, prdYear, prdMaker);
    }
}
