package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc(String title, String category, float cost, String director, int length, String Artist, ArrayList<Track> tracks  ) {
		super(title, category, cost, director, length);
		this.setArtist(Artist);
		this.addTrack(tracks);
	}
	public String toString() {
		return super.toString() + " " + this.artist ;
	}
	public void addTrack(ArrayList<Track> x) {
		Iterator<Track> it = x.iterator();
		while(it.hasNext()){
			Track i = it.next();
			if(!tracks.contains(i)) {
				tracks.add(i);
			} else return;
		}
	}
	public void removeTrack(Track x) {
		if(tracks.contains(x)) {
			int i = tracks.indexOf(x);
			tracks.remove(i);
		} else return;
	}
	public int getLength() {
		int sum = 0;
		Iterator<Track> it = tracks.iterator();
	    while(it.hasNext()) {
	      Track s = it.next();
	      sum+=s.getLength();
	    }
	    return sum;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void play() {
		Iterator<Track> it = tracks.iterator();
		while(it.hasNext()) {
			Track t = it.next();
			t.play();
		}
	}
}
