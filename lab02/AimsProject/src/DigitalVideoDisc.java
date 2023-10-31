public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	// getter and setter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	// Add contructor to create DVD by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	// Add contructor to create DVD by title, category and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	// Add contructor to create DVD by title, category, cost, director
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	// Add contructor to create DVD by title, category, cost, director, length
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	// Compare disc
	public boolean compare2Disc(DigitalVideoDisc disc) {
		if(this.title.equals(disc.title) 
			&& this.category.equals(disc.category) 
			&& this.director.equals(disc.director) 
			&& this.cost == disc.cost 
			&& this.length == disc.length)
			return true;
		return false;
	}
}
