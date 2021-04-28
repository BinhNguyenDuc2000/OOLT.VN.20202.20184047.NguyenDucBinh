package hust.soict.hedspi.aims.utils;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// Constructor moi
		MyDate date = new MyDate("31","March","2000");
		date.print();
		// Ham hoi nhu cau in ra man hinh cua nguoi dung
		System.out.println("Which is your preference?\n"
						+ "1. y/m/d\n"
						+ "2. m/d/y\n"
						+ "3. d/m/y");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
				case "1": 
				case "y/m/d":
					MyDate.setDisplayType(1); 
					break;
				case "2":
				case "m/d/y":
					MyDate.setDisplayType(2);
					break;
				default:
					MyDate.setDisplayType(3);
					break;
				}			
				switch (option) {
				case "1": 
				case "y/m/d":
					MyDate.setDisplayType(1); 
					break;
				case "2":
				case "m/d/y":
					MyDate.setDisplayType(2);
					break;
				default:
					MyDate.setDisplayType(3);
					break;
		}						
		date.printDateString();
		System.out.println("Initializing date list");
		MyDate listDate[] = new MyDate[5];
		listDate[0] = new MyDate(10,1,10);
		listDate[1] = new MyDate(3,3,3);
		listDate[2] = new MyDate(29,2,4);
		listDate[3] = new MyDate(31,5,3);
		listDate[4] = new MyDate(20,2,4);
		
		// Kiem tra ham so sanh ngay
		System.out.println("Testing compare function");
		System.out.println(DateUtils.compareDate(listDate[0], listDate[1]));
		System.out.println(DateUtils.compareDate(listDate[0], listDate[0]));
		System.out.println(DateUtils.compareDate(listDate[3], listDate[1]));
		
		// Kiem tra ham xap xep
		System.out.println("Testing sort function\nBefore sorting: ");
		DateUtils.printList(listDate);
		DateUtils.sortDate(listDate);
		System.out.println("After sorting:");
		DateUtils.printList(listDate);
		
		scanner.close();
		System.exit(0);
	}

}
