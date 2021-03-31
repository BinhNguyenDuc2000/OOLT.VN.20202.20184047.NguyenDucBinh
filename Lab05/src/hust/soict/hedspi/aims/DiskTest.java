package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		// Kiem tra tim sau
		DigitalVideoDisc digitalVideoDisc = new DigitalVideoDisc("The Lion King");
		System.out.println(digitalVideoDisc.search("The King"));
		System.out.println(digitalVideoDisc.search("The Queen"));
		// Kiem tra lucky item
		Order order = new Order();
		Aims.TestOrder1(order);
		
		
		System.out.println("Before lucky item");
		order.getLuckyItem();
		order.printList();
		System.out.println("After lucky item");


	}

}
