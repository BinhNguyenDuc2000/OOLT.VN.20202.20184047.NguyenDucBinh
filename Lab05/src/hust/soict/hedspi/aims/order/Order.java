package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public final static int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyORDERED;
	private MyDate dateOrdered;
	public Order() {
		super();
		nbOrders++;
		this.qtyORDERED = 0;
		dateOrdered = new MyDate();
	}
	
	public DigitalVideoDisc getLuckyItem() {
		int i = (int) Math.random();
		i = i % qtyORDERED;
		itemsOrdered[i].setCost(0);
		return itemsOrdered[i];
	} 
	
	public MyDate getDateOrdered() {
		return this.dateOrdered;
	}
	
	public static int getNborders() {
		return nbOrders;
	}
	
	public void setDateOrdered(int day,int month,int year) {
		this.dateOrdered.setYear(year);
		this.dateOrdered.setMonth(month);
		this.dateOrdered.setDay(day);
	}
	
	public int getqtyORDERED() {
		return qtyORDERED;
	}

	public void addDigtalVideoDisc(DigitalVideoDisc disc) {
		if (disc==null) {
			System.out.println("The disc doesn't exist.");
			return;
		}
		if(qtyORDERED<(MAX_NUMBER_ORDERED-1)) {
			itemsOrdered[qtyORDERED] = disc;
			System.out.println("The disc have been added.");
		    qtyORDERED++;
		}
		else {
			System.out.println("The order list is full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
		if (dvdList.length==0) {
			System.out.println("The list is empty.");
			return;
		}
		if(MAX_NUMBER_ORDERED-dvdList.length<this.qtyORDERED) {
			System.out.println("Too many discs");
		}
		else {
			for (int i=this.qtyORDERED;i<this.qtyORDERED+dvdList.length ;i++) {
				addDigtalVideoDisc(dvdList[i-qtyORDERED]);
			}
			System.out.println("The order list has been updated");
		}
	}
	
	/*public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		if(dvdList==null || dvdList.length==0) {
			System.out.println("The list is empty");
			return;
		}
		if(MAX_NUMBER_ORDERED-dvdList.length<this.qtyORDERED) {
			System.out.println("Too many discs");
		}
		else {
			for (int i=this.qtyORDERED;i<this.qtyORDERED+dvdList.length ;i++) {
				this.itemsOrdered[i]=dvdList[i-this.qtyORDERED];
			}
			System.out.println("The order list has been updated");
			this.qtyORDERED += dvdList.length;
		}
	} */
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		int tmp = MAX_NUMBER_ORDERED-qtyORDERED;
		if (tmp>=2) {
			addDigtalVideoDisc(dvd1);
			addDigtalVideoDisc(dvd2);
		}
		else {
			if (tmp==1){
				addDigtalVideoDisc(dvd1);
				System.out.println("the dvd " + dvd2.getTitle( ) + " could not be added.");
			}
			else {
				if (tmp<=0) {
				System.out.println("The item quantity has reached its limit.");
				}
			}
		}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyORDERED==0) {
			System.out.println("The order is empty");
			return;
		}
		int checker = 0;
		outer:
		for (int i=0;i<qtyORDERED;i++) {
			if (this.itemsOrdered[i].getTitle()==(disc.getTitle())) {
				System.out.println("The disc have been removed at order number " + (i+1));
				this.qtyORDERED--;
				for (int j=i;j<this.qtyORDERED;j++) {
					checker = 1;
					this.itemsOrdered[j]=this.itemsOrdered[j+1];					
				}
				break outer;
			}
			
		}
		if (checker==0) {
			System.out.println("The disc was not in the order list");	
		}
	}
	public float totalCost() {
		float cost = 0;
		for (int i=0;i<this.qtyORDERED;i++) {
			cost=Float.sum(cost, this.itemsOrdered[i].getCost());
		}
		return cost;
	}
	public void printList() {
		System.out.println("**********Order**********");
		System.out.println("Date:" + this.dateOrdered.DateString());
		System.out.println("Ordered items:");
		for (int i=0;i<getqtyORDERED();i++) {
			if (itemsOrdered[i].getCost()==0) {
				System.out.println(i +". DVD - " + itemsOrdered[i].getTitle()
						+ " - " + itemsOrdered[i].getDirector()
						+ " - " + itemsOrdered[i].getLength()
						+ ": " + itemsOrdered[i].getCost() + "$ Congrat for the lucky item");
			}
			else {
				System.out.println(i +". DVD - " + itemsOrdered[i].getTitle()
						+ " - " + itemsOrdered[i].getDirector()
						+ " - " + itemsOrdered[i].getLength()
						+ ": " + itemsOrdered[i].getCost() + "$");
			}
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*************************");
		return;
	}
	
}
	

