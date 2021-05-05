package hust.soict.hedspi.aims;
import java.util.Collections;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class Aims {
	private static void DVD() {
		java.util.Collection<Media> DVDcollection	= new java.util.ArrayList<Media>();
		
		// Add objects to the arraylist
		DVDcollection.add(new DigitalVideoDisc("hello", "science", 12f, 5, "sir"));
		DVDcollection.add(new DigitalVideoDisc("world","science",1f,7,"Alex"));
		DVDcollection.add(new DigitalVideoDisc("my","action",9f,4,"Feb"));
		DVDcollection.add(new Book("apple"));
		
		// Iterate through the ArrayList and output
		// (unsorted order)
		java.util.Iterator<Media> iterator = DVDcollection.iterator();
		
		System.out.println("-----------------");
		System.out.println("The DVD in unsorted order:");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
			
		}
		
		// After sort
		System.out.println("-----------------");
		System.out.println("The DVD in sorted order:");
		Collections.sort((List<Media>)DVDcollection);
		iterator = DVDcollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}
		
	}
	private static void CD() {
		java.util.Collection<Media> CDcollection	= new java.util.ArrayList<Media>();
		
		// Add objects to the arraylist
		CompactDisc cd1 = new CompactDisc("hello", "sad", 0f, 10, "n/a");
		CompactDisc cd2 = new CompactDisc("hello5", "sad", 0f, 10, "n/a");
		CompactDisc cd3 = new CompactDisc("hello4", "sad", 0f, 10, "n/a");
		CompactDisc cd4 = new CompactDisc("hello3", "sad", 0f, 10, "n/a");
		cd1.addTrack(new Track("pog", 100));
		cd1.addTrack(new Track("poggies", 10));
		cd1.addTrack(new Track("pogger",14));
		cd2.addTrack(new Track("pog", 90));
		cd3.addTrack(new Track("pog", 100));
		cd4.addTrack(new Track("pog", 100));
		CDcollection.add(cd1);
		CDcollection.add(cd2);
		CDcollection.add(cd3);
		CDcollection.add(cd4);
		CDcollection.add(new DigitalVideoDisc("world","science",1f,7,"Alex"));
		CDcollection.add(new DigitalVideoDisc("my","action",9f,4,"Feb"));
		CDcollection.add(new Book("apple"));
		
		// Iterate through the ArrayList and output
		// (unsorted order)
		java.util.Iterator<Media> iterator = CDcollection.iterator();
		
		System.out.println("-----------------");
		System.out.println("The CD in unsorted order:");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
			
		}
		
		// After sort
		System.out.println("-----------------");
		System.out.println("The CD in sorted order:");
		Collections.sort((List<Media>)CDcollection);
		iterator = CDcollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}
		
	}

	public static void main(String[] args) {
		DVD();
		CD();
	}
}
