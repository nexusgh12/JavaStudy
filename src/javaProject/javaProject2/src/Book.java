public class Book {
    private String bookNo;
    public String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private int bookPrice;
    private String bookPublisher;

    Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher){
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    public String toString(){
        int lenBookNo = 8 - (bookNo.length() - bookNo.getBytes().length);

        return String.format("%-" +lenBookNo+ "s"+"%-10s"+ "%-6s%-8d%-10d%-10s",bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
    }
}
