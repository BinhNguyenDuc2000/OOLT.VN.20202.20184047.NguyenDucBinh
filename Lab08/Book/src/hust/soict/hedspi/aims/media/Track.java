package hust.soict.hedspi.aims.media;

public class Track implements Comparable<Track>{
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
	@Override
	public boolean equals(Object O) {
		if(O instanceof Track) {
			Track newTrack = (Track) O;
			return (newTrack.getTitle() ==this.getTitle()&&
					newTrack.getLength()==this.getLength())?true:false;
		}
		return false;
	}
	@Override
	public int compareTo(Track track) {
		if(track instanceof Track) {
			return this.getTitle().compareTo(track.getTitle());
		}
		System.out.println("There was an errror");
		return 0;
	}

	
}
