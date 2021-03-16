public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyORDERED;
	public Order() {
		super();
		this.qtyORDERED = 0;
	}
	public void addDigtalVideoDisc(DigitalVideoDisc disc) {
		if(qtyORDERED<(MAX_NUMBER_ORDERED-1)) {
			itemsOrdered[qtyORDERED] = disc;
			System.out.println("The disc have been added");
			qtyORDERED++;
		}
		else {
			System.out.println("The order list is full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyORDERED==0) {
			System.out.println("The order is empty");
			return;
		}
		int checker = 0;
		for (int i=0;i<qtyORDERED;i++) {
			if (itemsOrdered[i]==disc) {
				System.out.println("The disc have been removed at order number " + (i+1));
				qtyORDERED--;
				for (int j=i;j<qtyORDERED;j++) {
					checker = 1;
					itemsOrdered[j]=itemsOrdered[j+1];					
				}
				
			}
			
		}
		if (checker==0) {
			System.out.println("The disc was not in the order list");	
		}
	}
	public float totalCost() {
		float cost = 0;
		for (int i=0;i<qtyORDERED;i++) {
			cost=Float.sum(cost, itemsOrdered[i].getCost());
		}
		return cost;
	}
	
}
	

