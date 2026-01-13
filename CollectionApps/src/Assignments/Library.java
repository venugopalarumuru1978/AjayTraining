package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> bookList = new ArrayList<Book>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	void addBook(Book bobj)
	{
		bookList.add(bobj);
		System.out.println("Book Added...");
	}
	
	boolean isEmpty()
	{
		if(bookList.isEmpty())
			return true;
		else
			return false;
	}
	
	List<Book> viewAllBooks()
	{
		//return bookList;
		return this.getBookList();
	}
	
	
	List<Book> viewBooksByAuthor(String author)
	{
		List<Book> booksByAuthor = new ArrayList<Book>();
		
		for(Book b : bookList)
		{
			if(b.getAuthor().equals(author))
			{
				booksByAuthor.add(b);
			}
		}
		return booksByAuthor;
	}
	
	int countnoofbook(String bname)
	{
		int bkCount = 0;
		for(Book b : bookList)
		{
			if(b.getBookName().contains(bname))
			{
				bkCount++;
			}
		}
		return bkCount;
	}
}
