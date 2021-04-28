package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors =new ArrayList<String>();
	// Constructors
	public Book() {
		super();
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title,String category) {
		super(title,category);
	}
	public Book(String title,String category,ArrayList<String> authors) {
		super(title,category);
		setAuthors(authors);
	}
	// Getters and Setters
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		for (int i=0; i<authors.size();i++) {
			addAuthor(authors.get(i));
		}
	}
	
	// Add and remove Author
	public void addAuthor(String authorName) {
		for (int i=0;i<authors.size();i++) {
			if (authors.get(i).equals(authorName)) {
				System.out.println("The author is already included");
				return;
			}
		}
		authors.add(authorName);
	}
	public void removeAuthor(String authorName) {
		for (int i=0;i<authors.size();i++) {
			if (authors.get(i).equals(authorName)) {
				authors.remove(i);
				System.out.println("The author is deleted");
				return;
			}
		System.out.println("Cannot find the author");
		}
		
	}
	public void name() {
		
	}

}
