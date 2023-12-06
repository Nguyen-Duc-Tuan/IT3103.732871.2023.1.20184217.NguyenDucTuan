package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String> ();
	public Book(String title, String category, float cost, ArrayList<String> name) {
		super(title, category, cost);
		this.addAuthor(name);
	}
	public String toString() {
		return super.toString() + " " + Arrays.toString(this.authors.toArray());
	}
	public String getAuthor() {
		return authors.toString();
	}
	public void addAuthor(ArrayList<String> name) {
		Iterator<String> it = name.iterator();
		while(it.hasNext()) {
			String s = it.next();
			authors.add(s);
		}
	}
	public void removeAuthor(String[] name) {
		for(String s:name) {
			if(authors.contains(s)) {
				int i = authors.indexOf(s);
				authors.remove(i);
			} else continue;
		}
	}
}
