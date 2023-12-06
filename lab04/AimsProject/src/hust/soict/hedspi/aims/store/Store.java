package hust.soict.hedspi.aims.store;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import hust.soict.hedspi.aims.media.Media;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Store {
	private static int currentNumberInStore = 0;
	private List<Media> itemsInStore = new ArrayList<Media>();

	public Store() {
		
	}
	
	public void addMedia(Media dvd) {
		++currentNumberInStore;
		itemsInStore.add(dvd);
	}
	public void removeMedia(Media dvd) {
		if(itemsInStore.contains(dvd)) {
			int i = itemsInStore.indexOf(dvd);
			itemsInStore.remove(i);
			--currentNumberInStore;
		} else {
			System.out.println("Item not found");
		}
	}
	public void printOut() {
		Iterator<Media> it = itemsInStore.iterator();
		System.out.println("Has" + currentNumberInStore + " item in Store");
		while(it.hasNext()) {
			Media s = it.next();
			System.out.println(s.getId() + " " + s.getTitle() + " " + s.getCategory() + " " +s.getCost());
	    }
	}

	public int currentId() {
		return this.itemsInStore.size();
	}
	
	public Media findById(int id) {
		for (Media media : itemsInStore) {
			if (media.getId()==id) {
				return media;
			}
		}
		System.out.println("Not found");
		return null;
		
	}
	
	public Media findByTitle(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		System.out.println("Not found");
		return null;
		
	}
}
