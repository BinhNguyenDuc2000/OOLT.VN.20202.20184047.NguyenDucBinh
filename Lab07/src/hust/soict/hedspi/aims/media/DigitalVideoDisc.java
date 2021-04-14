package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class DigitalVideoDisc extends Disc implements Playable{
//	private String director;
//	private int length;
	public Boolean equals(DigitalVideoDisc objDigitalVideoDisc) {
		if (this.getTitle().equals(objDigitalVideoDisc.getTitle())==false)
			return false;
		if (this.getCategory().equals(objDigitalVideoDisc.getCategory())==false)
			return false;
//		if (this.director.equals(objDigitalVideoDisc.getDirector())==false)
//			return false;
//		if (this.length!=objDigitalVideoDisc.length)
//			return false;
		if (this.getCost()!=objDigitalVideoDisc.getCost())
			return false;
		return true;
	}
//	public String getDirector() {
//		return director;
//	}
//	public void setDirector(String director) {
//		this.director = director;
//	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public DigitalVideoDisc(String title) {
//		super();
//		this.setTitle(title);
//	}
//	public DigitalVideoDisc(String title, String category) {
//		super();
//		this.setTitle(title);
//		this.setCategory(category);
//	}
//	public DigitalVideoDisc(String title, String category, String director) {
//		super();
//		this.setTitle(title);
//		this.setCategory(category);
//		this.director = director;
//	}
//	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		super();
//		this.setTitle(title);
//		this.setCategory(category);
//		this.director = director;
//		this.length = length;
//		this.setCost(cost);	
//	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public boolean search(String title) {
		String tokenList[] = new String[100];
		int i,k;
		try (Scanner scanner1 = new Scanner(title).useDelimiter(" "))
		{
			i=0;
			while (scanner1.hasNext()) {
				tokenList[i] = scanner1.next();
				i++;
		
			}
		}
		
		try(Scanner scanner2 = new Scanner(this.getTitle()).useDelimiter(" ")) {
			String tokenDVDList[] = new String[100];
			int j=0;
			while (scanner2.hasNext()) {
				tokenDVDList[j] = scanner2.next();
				j++;
			}
			k=0;
			for (int l=0;l<j;l++)
			{
				if (tokenDVDList[l].equals(tokenList[k])) {
					k++;
				}
			}
		}
		return k==i ? true:false;
	}
	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title, int length, String director) {
		super(title, length, director);
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title, String category, int length, String director) {
		super(title, category, length, director);
		// TODO Auto-generated constructor stub
	}
	
}
