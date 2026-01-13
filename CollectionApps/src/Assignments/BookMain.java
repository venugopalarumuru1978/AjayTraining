package Assignments;

import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Library libObj = new Library();
		Book bObj = null;
		Scanner scObj = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Book\n2. Display all book details\n3. Search Book by author\n4. Count number of books - by book name\n5. Exit");
			System.out.println("Please pick ur choice ");
			int ch = scObj.nextInt();
			switch(ch)
			{
			case 1:
				bObj = new Book();
				System.out.println("Enter ISBN Number ");
				bObj.setIsbnno(scObj.nextInt());
				System.out.println("Enter Book Name ");
				bObj.setBookName(scObj.next());
				System.out.println("Enter Book Author ");
				bObj.setAuthor(scObj.next());
				
				libObj.addBook(bObj);
				break;
			case 2:
				List<Book>  bkList = libObj.viewAllBooks();
				if(bkList.isEmpty())
					System.out.println("No Books exist in Library");
				else
				{
					for(Book b : bkList)
					{
						System.out.println("Book No : " + b.getIsbnno());
						System.out.println("Book Name : " + b.getBookName());
						System.out.println("Book Author : " + b.getAuthor());
						System.out.println("--------------");
					}
				}
				break;
			case 3:
				System.out.println("Enter author name");
				String author = scObj.next();
				
				List<Book>  authorList = libObj.viewBooksByAuthor(author);
				if(authorList.isEmpty())
					System.out.println("No Books exist in Library with given author");
				else
				{
					for(Book b : authorList)
					{
						System.out.println("Book No : " + b.getIsbnno());
						System.out.println("Book Name : " + b.getBookName());
						System.out.println("Book Author : " + b.getAuthor());
						System.out.println("--------------");
					}
				}
				break;
			case 4:
				System.out.println("Enter book name");
				String bname = scObj.next();
				
				int cntBooks = libObj.countnoofbook(bname);
				
				if(cntBooks==0)
					System.out.println("No Book exist with given name ");
				else
					System.out.println("Found " + cntBooks + " Books");
				break;
			case 5:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}

}
