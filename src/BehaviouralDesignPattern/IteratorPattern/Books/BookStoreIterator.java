package BehaviouralDesignPattern.IteratorPattern.Books;

public class BookStoreIterator implements BookIterator{
	
	
	protected int currentBook = 0;
	protected Book[] books;
	public BookStoreIterator(Book[] books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return (currentBook < books.length && books[currentBook] != null);
	}

	@Override
	public Book next() {
		return books[currentBook++];
	}
}
