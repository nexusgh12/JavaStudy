package javaProject2;

public class Magazine extends Book {

	private int month;
	Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		this.month = month;
	}
	
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t%s\t%4d\t",getBookNo(), getBookTitle(), getBookAuthor(), getBookYear(), getBookPrice(), getBookPublisher(), getMonth());
	}
	
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}

}
