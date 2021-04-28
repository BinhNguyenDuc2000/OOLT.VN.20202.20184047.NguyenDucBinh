package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media {
	private ArrayList<String> authors =new ArrayList<String>();
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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

	
	// Processor
	public void processContent() {
		contentTokens = Arrays.asList( content.split(" "));
		Collections.sort(contentTokens);
		wordFrequency = new HashMap<String, Integer>();
		Iterator<String> iterator = contentTokens.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer frequency = wordFrequency.get(key);
			if (frequency==null) frequency = 1;
			else {
				int value = frequency.intValue();
				frequency = value+1;
			}
			wordFrequency.put(key, frequency);
		}
		wordFrequency = new TreeMap<String, Integer>(wordFrequency);
	}
	
	@Override
	public String toString() {
		return wordFrequency.toString();
	}
}
