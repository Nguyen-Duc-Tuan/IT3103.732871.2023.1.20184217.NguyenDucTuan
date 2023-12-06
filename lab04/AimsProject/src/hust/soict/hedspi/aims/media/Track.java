package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public Track(String title, int length) {
		this.setLength(length);
		this.setTitle(title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public boolean equals(Object o) {
		if(o instanceof Track) {
			Track s = (Track) o;
			if(this.title.equals(s.getTitle()) == true && this.length == s.getLength()) {
				return true;
			}
			return false;
		}
		return false;
	}
}
