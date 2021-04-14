package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(String title, int length, String director) {
		super(title, length, director);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, int length, String director) {
		super(title, category, length, director);
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}
	public void addTrack(Track newTrack) {
		if(!tracks.contains(newTrack)) {
			tracks.add(newTrack);
			System.out.println("Added new track");
		}
	}
	public void removeTrack(Track newTrack) {
		if(tracks.contains(newTrack)) {
			tracks.remove(newTrack);
			System.out.println("Removed a track");
		}
	}
	@Override
	public int getLength() {
		int totalLength = 0;
		for (int i=0;i<tracks.size();i++) {
			totalLength+=tracks.get(i).getLength();
		}
		return totalLength;
	}
	public void play() {
		tracks.forEach(n -> n.play());
	}
}
