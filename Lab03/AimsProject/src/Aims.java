
public class Aims {

	public static void main(String[] args) {
		// Create a new dvd object and set the fields
		Order anOrder = new Order();
		DigitalVideoDisc dvdDisc1 = new DigitalVideoDisc("The Lion King");
		dvdDisc1.setCategory("Animation");
		dvdDisc1.setCost(19.95f);
		dvdDisc1.setDirector("George Lucas");
		dvdDisc1.setLength(87);
		// Add the first dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc1);
		
		DigitalVideoDisc dvdDisc2 = new DigitalVideoDisc("Star Wars");
		dvdDisc2.setCategory("Science fiction");
		dvdDisc2.setCost(24.95f);
		dvdDisc2.setDirector("George Lucas");
		dvdDisc2.setLength(124);
		// Add the second dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc2);
		
		DigitalVideoDisc dvdDisc3 = new DigitalVideoDisc("Aladin");
		dvdDisc3.setCategory("Animation");
		dvdDisc3.setCost(18.99f);
		dvdDisc3.setDirector("John Musker");
		dvdDisc3.setLength(90);
		// Add the third dvd to the order
		anOrder.addDigtalVideoDisc(dvdDisc3);
		
		// Print out the total cost
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		// Remove the second dvd from the order
		anOrder.removeDigitalVideoDisc(dvdDisc2);
		
		// Print out the total cost
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.exit(0);
	}

}
