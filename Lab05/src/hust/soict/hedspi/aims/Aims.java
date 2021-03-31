package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	
	public static Order MakeOrder() {
		int Nborders = Order.getNborders();
		System.out.println(Nborders);
		assert (Nborders < Order.MAX_LIMITED_ORDERS) : "Number of orders can't exceed limit.";
		Order anOrder = new Order();
		assert (Order.getNborders()-Nborders)==1 : "An order has been made.";
		System.out.println("The order has been made.");
		return anOrder;
	}
	public static void TestOrder1(Order anOrder) {
		assert anOrder!=null : "The order is not valid";
		DigitalVideoDisc dvdDisc1 = new DigitalVideoDisc("The Lion King");
		dvdDisc1.setCategory("Animation");
		dvdDisc1.setCost(19.95f);
		dvdDisc1.setDirector("George Lucas");
		dvdDisc1.setLength(87);
		// Add the first dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc1);
		assert anOrder.getqtyORDERED()==1 : "There is one dvd inside the order";
		
		DigitalVideoDisc dvdDisc2 = new DigitalVideoDisc("Star Wars");
		dvdDisc2.setCategory("Science fiction");
		dvdDisc2.setCost(24.95f);
		dvdDisc2.setDirector("George Lucas");
		dvdDisc2.setLength(124);
		// Add the second dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc2);
		assert anOrder.getqtyORDERED()==2 : "There are 2 dvd inside the order";
		
		DigitalVideoDisc dvdDisc3 = new DigitalVideoDisc("Aladin");
		dvdDisc3.setCategory("Animation");
		dvdDisc3.setCost(18.99f);
		dvdDisc3.setDirector("John Musker");
		dvdDisc3.setLength(90);
		// Add the third dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc3);
		assert anOrder.getqtyORDERED()==3 : "There are 3 dvd inside the order";
		anOrder.printList();
	}
	public static void TestOrder2(Order anOrder) {
		assert anOrder!=null : "The order is not valid";
		DigitalVideoDisc dvdDisc1 = new DigitalVideoDisc("Snow White");
		dvdDisc1.setCategory("Animation");
		dvdDisc1.setCost(20.95f);
		dvdDisc1.setDirector("George Lucas");
		dvdDisc1.setLength(87);
		// Add the first dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc1);
		assert anOrder.getqtyORDERED()==1 : "There is one dvd inside the order";
		
		DigitalVideoDisc dvdDisc2 = new DigitalVideoDisc("Star Wars");
		dvdDisc2.setCategory("Science fiction");
		dvdDisc2.setCost(24.95f);
		dvdDisc2.setDirector("George Lucas");
		dvdDisc2.setLength(124);
		// Add the second dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc2);
		assert anOrder.getqtyORDERED()==2 : "There are 2 dvd inside the order";
		anOrder.printList();
	}
	public static void main(String[] args) {
		Order order1 = MakeOrder();
		Order order2 = MakeOrder();
		Order order3 = MakeOrder();
		Order order4 = MakeOrder();
		Order order5 = MakeOrder();
		// Order order6 = MakeOrder();
		TestOrder1(order1);
		TestOrder2(order2);
		TestOrder1(order5);
		System.exit(0);
	}

}
