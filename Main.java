package program2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		BookStore b = new BookStore(10);
		int n;
		b.init();
		
		Scanner sc = new Scanner(System.in);	   
	    System.out.println("Enter “1”, to display the Books in format: Title – Author – ISBN - Quantity.");
		System.out.println("Enter “2”, to order new books.");
	    System.out.println("Enter “3”, to sell books.");
	   	System.out.println("Enter “0”, to exit the system.");
	   	do
	   	{
	    n = sc.nextInt();
	   
	   	switch(n)
	   	{
	   	
	   	case 1 :
	   		
	   		            b.display();
	   	           System.out.println("Another Choice..");
	   	               break;
	   	case 2:
	   		
	   	                 b.order("ISBN101",2);
	                   break;
	   	case 3: 
	   		        
	   					 b.sell("Java1", 3);
	                   break;
	   	case 0:     
	   		
	   		       System.out.println(" Exit ");
	   		          break;
	   	}
	
	    }while(n!=0);
	}
}
