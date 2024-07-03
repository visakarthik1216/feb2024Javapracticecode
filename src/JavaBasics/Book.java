package JavaBasics;

public class Book {
	
	String title;
	String author;
	int pageCount;
	static int totalBooks=0;
	

	public static void main(String[] args) {
		
		//q1 :Create three Book objects and initialize their properties with different values.
		
		
		Book b1=new Book();
	    b1.title= "the king and the queen";
	    b1.author="vihaan j";
	    b1.pageCount=100;
	    totalBooks++;
	    
	    Book b2=new Book();
	    b2.title= "the diary of whimpykid";
	    b2.author="sophie";
	    b2.pageCount=500;
	    totalBooks++;
	    
	    Book b3=new Book();
	    b3.title= "the lazy brother";
	    b3.author="yuvaan";
	    b3.pageCount=1000;
	    totalBooks++;
	    
	    //q2 Print the details of each book and the total number of books.
	    
	    System.out.println("First book details : " + b1.title+ " "+ b1.author+" "+ b1.pageCount );
	    System.out.println("second book details : " + b2.title+ " "+ b2.author+" "+ b2.pageCount );
	    System.out.println("third book details : " + b3.title+ " "+ b3.author+" "+ b3.pageCount );
	    System.out.println("toal number of books : "+totalBooks);
	    
	    
	    // q3:Modify the pageCount attribute of one book and print the updated details.
	    
	    b3.pageCount=2000;
	    System.out.println("third book details : " + b3.title+ " "+ b3.author+" "+ b3.pageCount );
	    
	    // q4 :Create another Book object and update the total number of books.
	    
	    Book b4=new Book();
	    b4.title= "beautiful butterfly";
	    b4.author="henry martin";
	    b4.pageCount=200;
	    totalBooks++;
	    System.out.println("third book details : " + b4.title+ " "+ b4.author+" "+ b4.pageCount );
	    System.out.println("toal number of books : "+totalBooks);
	    
	      
	    
	    
		
		

	}

}
