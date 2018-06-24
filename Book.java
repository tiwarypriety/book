package program2;

public class Book {

	String bookTitle;
	String author;
	String ISBN;
	int numOfCopies;
	
	public Book() {
		super();
	}
	public Book(String bookTitle, String author, String iSBN, int numOfCopies) 
	{
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getNumOfCopies(){
		return numOfCopies;
	}
	public void  setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
  void display(){
	  System.out.println(bookTitle+" "+author+" "+ISBN+" "+numOfCopies);
  }
	
	
}
