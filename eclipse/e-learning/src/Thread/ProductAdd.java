package Thread;

 class ProductAdd implements Runnable{
	 Pool pool;
	 
	 ProductAdd(Pool pool){
		 this.pool = pool;
		 
	 }
	 
	 public void run() {
		 for(int i = 0; i < 10; i++) {
			 pool.add("��ǰ : " + i);
			 System.out.println("��ǰ �԰�!");
		 }
	 }

}
