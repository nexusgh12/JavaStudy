class test1 {
	
	int[] prdNo = {1, 2, 3};
	String[] prdName = {"노트북", "모니터", "마우스"};
	int[] prdPrice = {1200000, 300000, 30000};
	int[] prdYear = {2021, 2021, 2020};
	String[] prdMaker = {"삼성", "LG", "로지텍"};
	
	public String toString(){
	     String result = "";
	      for(int i=0; i<prdNo.length; i++) {
	         result += String.format("%03d\t%s\t%d\t%d\t%s%n", prdNo[i], prdName[i], prdPrice[i], prdYear[i], prdMaker[i]);
	      }
	     return result;
	   }
      
}

class test{
    public static void main(String[] args) {
		test1 p = new test1();
	    
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("-------------------------------------");
		System.out.println(p.toString());
	}
}