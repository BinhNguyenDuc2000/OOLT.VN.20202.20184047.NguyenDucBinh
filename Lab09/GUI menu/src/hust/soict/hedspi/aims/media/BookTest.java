package hust.soict.hedspi.aims.media;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("hello");
		book.setContent("kappa kappa 123 123 123 kappa apple");
		book.processContent();
		System.out.println(book.toString());
	}
}
