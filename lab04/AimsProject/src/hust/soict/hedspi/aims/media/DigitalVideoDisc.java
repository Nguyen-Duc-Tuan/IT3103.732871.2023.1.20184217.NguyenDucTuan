package hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}
	public boolean compare2Disc(DigitalVideoDisc disc) {
		if(this.getTitle().equals(disc.getTitle()) 
			&& this.getCategory().equals(disc.getCategory()) 
			&& this.getDirector().equals(disc.getDirector()) 
			&& this.getCost() == disc.getCost() 
			&& this.getLength() == disc.getLength())
			return true;
		return false;
	}
	public int isMatch(int id) {
		if(this.getId() == id) {
			System.out.println("Found! Disc is " + getTitle());
			return 1;
		}
		else {
			System.out.println("Not this one !");
			return 0;
		}
	}
	public int isMatch(String title) {
		if(this.getTitle().equals(title)) {
			System.out.println("Found! Disc is " + getTitle());
			return 1;
		}
		else {
			System.out.println("Not this one !");
			return 0;
		}
		// Sử dụng vòng lặp ở bên ngoài class này. Nếu không nhận được bất kì lần return 1 nào thì in ra Not Found.
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
