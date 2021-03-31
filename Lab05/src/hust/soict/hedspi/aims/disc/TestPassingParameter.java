package hust.soict.hedspi.aims.disc;

public class TestPassingParameter {
	public static void swap(Object o1,Object o2){
		DigitalVideoDisc d1 = (DigitalVideoDisc)o1;
		DigitalVideoDisc d2 = (DigitalVideoDisc)o2;
		if (d1==null || d2==null ) {
			System.out.println("Some of the discs don't exist.");
			return;
		}
		String tmpTitle = d1.getTitle();
		d1.setTitle(d2.getTitle());
		d2.setTitle(tmpTitle);
		String tmpCatergory = d1.getCategory();
		d1.setCategory(d2.getCategory());
		d2.setCategory(tmpCatergory);
		String tmpDirector = d1.getDirector();
		d1.setDirector(tmpDirector);
		d2.setDirector(tmpDirector);
		float tmpCost = d1.getCost();
		d1.setCost(d2.getCost());
		d2.setCost(tmpCost);
		int tmpLength = d1.getLength();
		d1.setLength(d2.getLength());
		d2.setLength(tmpLength);
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	public static void main(String arv[]) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
	}
}
