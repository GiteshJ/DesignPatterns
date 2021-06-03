package BehaviouralDesignPattern.IteratorPattern.Books;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary implements BookCollection {
	protected List<Book> books;

	public BookLibrary() {
		super();
		books = new ArrayList<Book>();
	}

	public boolean addBook(String language, String title, String author, long ISBN, double price) {
		Book book = new Book(language, title, author, ISBN, price);
		return books.add(book);
	}
	
	public boolean addBook(Book book) {
		return books.add(book);
	}
	
	public List<Book> getBooks() {
		return books;
	}

	@Override
	public BookIterator iterator() {
		return new BookLibraryIterator(books);
	}

}