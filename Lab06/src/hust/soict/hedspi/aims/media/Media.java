package hust.soict.hedspi.aims.media;

public class Media {
	private int id;
	private String title = "Not known title";
	private String category = "Not known category";
	private float cost;
	
	// Constructor
	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title,String category) {
		this.title = title;
		this.category = category;
	}
	
	public Media(String title,String category,float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	// Getter and Setter
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}

	// 

	public Media() {
		// TODO Auto-generated constructor stub
	}

}
