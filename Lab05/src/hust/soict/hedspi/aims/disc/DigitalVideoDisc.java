package hust.soict.hedspi.aims.disc;

import java.util.Scanner;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public Boolean equals(DigitalVideoDisc objDigitalVideoDisc) {
		if (this.title.equals(objDigitalVideoDisc.getTitle())==false)
			return false;
		if (this.category.equals(objDigitalVideoDisc.getCategory())==false)
			return false;
		if (this.director.equals(objDigitalVideoDisc.getDirector())==false)
			return false;
		if (this.length!=objDigitalVideoDisc.length)
			return false;
		if (this.cost!=objDigitalVideoDisc.cost)
			return false;
		return true;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public boolean search(String title) {
		Scanner scanner1 = new Scanner(title).useDelimiter(" ");
		String tokenList[] = new String[100];
		int i=0;
		while (scanner1.hasNext()) {
			tokenList[i] = scanner1.next();
			i++;
		}
		scanner1.close();
		Scanner scanner2 = new Scanner(this.getTitle()).useDelimiter(" ");
		String tokenDVDList[] = new String[100];
		int j=0;
		while (scanner2.hasNext()) {
			tokenDVDList[j] = scanner2.next();
			j++;
		}
		int k=0;
		for (int l=0;l<j;l++)
		{
			if (tokenDVDList[l].equals(tokenList[k])) {
				k++;
			}
		}
		scanner2.close();
		return k==i ? true:false;
	}
}
