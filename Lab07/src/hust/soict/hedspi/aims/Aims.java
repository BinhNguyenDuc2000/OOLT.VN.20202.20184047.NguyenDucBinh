package hust.soict.hedspi.aims;
import java.util.Scanner;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class Aims {
	private Order order= new Order();
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add item to the order");
		System.out.println("2. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	//Utilities Function
	
	
	
	
	
	public void add(Scanner keyboard) {
		System.out.println("");
		String type,title,category,director,checker;
		float cost;
		int length;
		
		System.out.println("What is the type to be added?");
		type = keyboard.next();
		System.out.println("What is the title?");
		title=keyboard.next();
		System.out.println("What is the category?");
		category=keyboard.next();
		
		switch (type) {
		case "DVD":
		case "DigitalVideoDisc":
			System.out.println("What is the cost?");
			cost=keyboard.nextFloat();
			System.out.println("What is the length?");
			length=keyboard.nextInt();
			System.out.println("Who is the director?");
			director = keyboard.next();
			DigitalVideoDisc dvd = new DigitalVideoDisc(title,category,cost,length,director);
			order.addDigitalVideoDisc(dvd);
			System.out.println("Do you want to play the DVD");
			checker = keyboard.next();
			if(checker=="yes"||checker=="y") {
				dvd.play();
			}
			break;
		case "CD":
		case "CompactDisc":
			System.out.println("What is the cost?");
			cost=keyboard.nextFloat();
			System.out.println("What is the length?");
			length=keyboard.nextInt();
			System.out.println("Who is the director?");
			director = keyboard.next();
			CompactDisc cd = new CompactDisc(title,category,cost,length,director);
			order.addCompactDisc(cd);
			System.out.println("CD added \nDo you want to add a track ");
			checker = keyboard.next();
			if(checker=="yes"||checker=="y") {
				System.out.println("What is the track title?");
				title=keyboard.next();
				System.out.println("What is the track lenth?");
				length=keyboard.nextInt();
				cd.addTrack(new Track(title,length));
			}
			System.out.println("Do you want to play the CD");
			checker = keyboard.next();
			if(checker=="yes"||checker=="y") {
				cd.play();
			}
			break;
		case "Book":
			Book book = new Book(title,category);
			order.addBook(book);
			break;
		default:
			break;
		}
		
	}
	public void printOrder(Scanner keyboard) {
		for(int i=0;i<order.getItemsOrdered().size();i++) {
			System.out.println(order.getItemsOrdered().get(i).getTitle());
		}
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
				add(keyboard);
				return testMenu(2,keyboard);
			case 2:
				printOrder(keyboard);
				return testMenu(3,keyboard);
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
