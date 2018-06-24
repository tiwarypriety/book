package program2;

public class BookStore 
{
Book[] book;

public BookStore()
{
	super();
}

public BookStore(int size)
{
	super();
	book = new Book[size];
	
}
void init()
{
	
		book[0] = new Book("Let Us C","Yashwant","ISBN101",10);
		book[1] = new Book("c++","Dennis","ISBN102",10);
		book[2] = new Book("Java1","Yashwant","ISBN103",10);
		book[3] = new Book("Java2","James Gosling","ISBN108",10);
		book[4] = new Book("Java3","James Gosling","ISBN109",20);
		book[5] = new Book("Java4","James Gosling","ISBN100",40);
		book[6] = new Book("Java5","James Gosling","ISBN104",10);
		book[7] = new Book("Java6","James Gosling","ISBN105",15);
		book[8] = new Book("Java7","James Gosling","ISBN106",20);
		book[9] = new Book("Java8","James Gosling","ISBN107",50);
}
public void sell(String bookTitle ,int noOfCopies)
{
	boolean bookFound = true;
	for(int i=0;i<book.length;i++)
	{
		if(book[i].getBookTitle().equals(bookTitle))
		{
			if(book[i].getNumOfCopies()>=noOfCopies)
			{
				book[i].setNumOfCopies(book[i].getNumOfCopies()-noOfCopies);
				bookFound = true;

			}
			else
			{
				bookFound=false;
			}

			if(bookFound)
			{
				System.out.println(book[i].getBookTitle()+" is SOlD "+book[i].getNumOfCopies()+" book left ");
			}
			else
			{
				System.out.println("Not Available..");
			}
			break;
		}
	}
	
}
public void order(String isbn, int noOfCopies)
{
boolean order = false;
for(int i =0;i<book.length;i++)
   {
		if(book[i].getISBN().equals(isbn))
		{
			book[i].setNumOfCopies(book[i].getNumOfCopies()+noOfCopies);
			order= true;
		}
   
	if(order)
		{
			System.out.println(book[i].getBookTitle()+"  Book Added");
			System.out.println("Number of Copies Available ="+book[i].getNumOfCopies());
		}
	else{
		addNewBook(i,isbn,noOfCopies);
			System.out.println("new Book Added");		
    	}
	break;
   }
}
	public void addNewBook(int i,String isbn,int noOfCopies)
	{
	book[++i].setISBN(isbn);
	book[i].setNumOfCopies(book[i].getNumOfCopies()+noOfCopies);
	}
void display()
    {
	for(int i=0;i<book.length;i++){
		book[i].display();
	}
  }
}
