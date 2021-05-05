package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media> {
	private int id;
	private String title = "Not known title";
	private String category = "Not known category";
	private float cost;
	
	// Constructor
	public Media() {
		
	}
	
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



//	public void setTitle(String title) {
//		this.title = title;
//	}



	public String getCategory() {
		return category;
	}



//	public void setCategory(String category) {
//		this.category = category;
//	}

	public float getCost() {
		return cost;
	}

//	public void setCost(float cost) {
//		this.cost = cost;
//	}	
	@Override
	public boolean equals(Object O) {
		if(O instanceof Media) {
			Media newMedia = (Media) O;
			return (newMedia.getId()==this.getId())?true:false;
		}
		return false;
	}
	@Override
	public int compareTo(Media media) {
		if(media instanceof Media) {
			return this.getTitle().compareTo(media.getTitle());
		}
		System.out.println("There was an errror");
		return 0;
	}
}
