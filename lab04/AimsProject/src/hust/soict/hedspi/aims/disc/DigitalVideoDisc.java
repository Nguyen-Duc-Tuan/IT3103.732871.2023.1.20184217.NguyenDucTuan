package hust.soict.hedspi.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	// Class attribute
	private static int nbDigitalVideoDiscs = 0;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		++DigitalVideoDisc.nbDigitalVideoDiscs;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}
	// Method overloading
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		++DigitalVideoDisc.nbDigitalVideoDiscs;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}
	// Method overloading
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		++DigitalVideoDisc.nbDigitalVideoDiscs;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}
	// Method overloading
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		++DigitalVideoDisc.nbDigitalVideoDiscs;
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
	}
	public boolean compare2Disc(DigitalVideoDisc disc) {
		if(this.title.equals(disc.title) 
			&& this.category.equals(disc.category) 
			&& this.director.equals(disc.director) 
			&& this.cost == disc.cost 
			&& this.length == disc.length)
			return true;
		return false;
	}
	public int isMatch(int id) {
		if(this.id == id) {
			System.out.println("Found! Disc is " + getTitle());
			return 1;
		}
		else {
			System.out.println("Not this one !");
			return 0;
		}
	}
	public int isMatch(String title) {
		if(this.title.equals(title)) {
			System.out.println("Found! Disc is " + getTitle());
			return 1;
		}
		else {
			System.out.println("Not this one !");
			return 0;
		}
		// Sử dụng vòng lặp ở bên ngoài class này. Nếu không nhận được bất kì lần return 1 nào thì in ra Not Found.
	}
}
