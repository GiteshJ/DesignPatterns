package BehaviouralDesignPattern.IteratorPattern.Books;

import java.util.List;

public class BookLibraryIterator implements BookIterator{
	
	protected int currentBook = 0;
	protected List<Book> books;
	public BookLibraryIterator(List<Book> books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return (currentBook < books.size() && books.get(currentBook) != null);
	}

	@Override
	public Book next() {
		return books.get(currentBook++);
	}
}
