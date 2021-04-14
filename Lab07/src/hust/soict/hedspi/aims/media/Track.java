package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length=0;
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	public Track(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
}
