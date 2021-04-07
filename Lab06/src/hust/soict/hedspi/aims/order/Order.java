package hust.soict.hedspi.aims.order;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	private int id;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered;
	public MyDate getDateOrdered() {
		return this.dateOrdered;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	//
	public void addMedia(String title,String category,float cost) {		
		itemsOrdered.add(new Media(title,category,cost));
	}

	public void removeMedia(String tilte) {
		for (int i=0; i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getTitle().equals(tilte)) {
				itemsOrdered.remove(i);
				System.out.println("The media has been deleted");
				return;
			}
		}
		System.out.println("Cannot find the media");
	}
	public float totalCost() {
		float sum=0;
		for	(int i=0;i<itemsOrdered.size();i++) {
			sum+= itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	//
	public void setDateOrdered(int day,int month,int year) {
		this.dateOrdered.setYear(year);
		this.dateOrdered.setMonth(month);
		this.dateOrdered.setDay(day);
	}
	
}
	

