package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.Media;

public class Aims {
	private ArrayList<Order> listOrder = new ArrayList<Order>();
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	//Utilities Function
	
	public void makeOrder(Scanner keyboard) {
		System.out.println("What's the order id?");
		
			int id=keyboard.nextInt();
			for (int i=0;i<listOrder.size();i++) {
				if (id==listOrder.get(i).getId()) {
					System.out.println("The id has already existed");
					return;
				}
			}
			Order newOrder = new Order();
			newOrder.setId(id);
			if(listOrder.add(newOrder)) {
			System.out.println("The order is added");
			}
		
	}
	
	public void addMedia(Scanner keyboard) {
		System.out.println("What's the id of the order?");
		
			int id=keyboard.nextInt();
			for (int i=0;i<listOrder.size();i++) {
				if (id==listOrder.get(i).getId()) {
					System.out.println("Founded the order!\n"
							+ "What's the id of the media?");
					int mediaId=0;
					if(keyboard.hasNextInt()) {
						mediaId = keyboard.nextInt();
					}
					if (listOrder.get(i).getItemsOrdered().size()==0) {
						System.out.println("The id is availible");
						Media newMedia = new Media();
						newMedia.setId(mediaId);
						listOrder.get(i).getItemsOrdered().add(newMedia);
						return;
					}
					for (int j=0;j<listOrder.get(i).getItemsOrdered().size();j++) {
						if (mediaId==listOrder.get(i).getItemsOrdered().get(j).getId()) {
							System.out.println("The id has already existed");
							return;
						}
					}
					System.out.println("The id is availible");
					Media newMedia = new Media();
					newMedia.setId(mediaId);
					listOrder.get(i).getItemsOrdered().add(newMedia);
					return;
					
				}
				
			}
			
			System.out.println("Cannot find the order\n");
		
		}

	
	public void deleteMedia(Scanner keyboard) {
		System.out.println("What's the id of the order?");
		
			int id=keyboard.nextInt();
			for (int i=0;i<listOrder.size();i++) {
				if (id==listOrder.get(i).getId()) {
					System.out.println("Founded the order!\n"
							+ "What's the id of the media?");
					int mediaId = keyboard.nextInt();
					for (int j=0;j<listOrder.get(i).getItemsOrdered().size();j++) {
						if (mediaId==listOrder.get(i).getItemsOrdered().get(j).getId()) {
							listOrder.get(i).getItemsOrdered().remove(j);
							System.out.println("The media has been removed");
							return;
						}
					}
					System.out.println("Cannot find the media");
					return;	
				}	
			}
			System.out.println("Cannot find the order");
		
	}
	
	public void printOrder(Scanner keyboard) {
		System.out.println("What's the id of the order?");
		
			int id=keyboard.nextInt();
			for (int i=0;i<listOrder.size();i++) {
				if (id==listOrder.get(i).getId()) {
					System.out.println("Founded the order!");
					if (listOrder.get(i).getItemsOrdered().size()==0) {
						System.out.println("The order is empty");
						return;
					}
					System.out.println("The order has:");
					for (int j=0;j<listOrder.get(i).getItemsOrdered().size();j++) {
						Media tmp = listOrder.get(i).getItemsOrdered().get(j);
						System.out.println(tmp.getTitle() + " - "
								+tmp.getCategory() + " - "
								+tmp.getId());
					}
					return;
				}
			
		}
		System.out.println("Cannot find the order");
	}
	//
	public int testMenu(int lastOption,Scanner keyboard) {
		if (lastOption==0) {
			System.out.println("Goodbye");
			return 0;
		}
		showMenu();
			int option=0;
			if (keyboard.hasNextInt()) {
				option = keyboard.nextInt();
				
			}
			switch (option) {
			case 1:
				makeOrder(keyboard);
				return testMenu(1,keyboard);
			case 2:
				addMedia(keyboard);
				return testMenu(2,keyboard);
			case 3:
				deleteMedia(keyboard);
				return testMenu(3,keyboard);
			case 4:
				printOrder(keyboard);
				return testMenu(4,keyboard);
			default:
				return testMenu(0,keyboard);
			}
		
	}
	public static void main(String[] args) {
		Aims newAims = new Aims();
		Scanner keyboard= new Scanner(System.in);
		newAims.testMenu(1,keyboard);
	}

}
