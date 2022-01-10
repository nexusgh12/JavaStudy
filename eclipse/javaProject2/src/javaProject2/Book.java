package javaProject2;

public class Book {
	private String bookNo;
    private String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private int bookPrice;
    private String bookPublisher;

    Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher){
        this.setBookNo(bookNo);
        this.setBookTitle(bookTitle);
        this.setBookAuthor(bookAuthor);
        this.setBookYear(bookYear);
        this.setBookPrice(bookPrice);
        this.setBookPublisher(bookPublisher);
    }

    public String toString(){
    	return String.format("%s\t%s\t%s\t%d\t%d\t%s\t",getBookNo(), getBookTitle(), getBookAuthor(), getBookYear(), 
				getBookPrice(), getBookPublisher());
    }

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
}
