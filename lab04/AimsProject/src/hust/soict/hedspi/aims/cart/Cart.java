package hust.soict.hedspi.aims.cart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
//import hust.soict.hedspi.aims.media.Track;

public class Cart {
	List<Media> itemOrdered = new ArrayList<Media>();
	public int getCurrentId() {
		return this.itemOrdered.size();
	}
	public void addMedia(Media media) {
			itemOrdered.add(media);
			System.out.println("The media has been added");
	}
	public void addMedia(Media [] mediaList) {
			for(Media i:mediaList) {
				itemOrdered.add(i);
			}
            System.out.println("The media has been added");
    }
    
    public void addMedia(Media media1, Media media2) {
    	itemOrdered.add(media1);
    	itemOrdered.add(media2);
        System.out.println("The media has been added");
    }
	public void removeMedia(Media media) {
		if(itemOrdered.contains(media)) {
			int i = itemOrdered.indexOf(media);
			itemOrdered.remove(i);
		}
	}
	public double totalCost() {
		float sum=0;
		Iterator<Media> it = itemOrdered.iterator();
	    while(it.hasNext()) {
	    	Media s = it.next();
	    	sum+=s.getCost();
	    }	
		return sum;
	}
	public void printOut() {
		if(itemOrdered.isEmpty() == false) {
			Iterator<Media> it = itemOrdered.iterator();
			int index = 0;
			System.out.println("***********************CART***********************");
			System.out.println("Ordered Items:");
				while(it.hasNext()) {
					Media s = it.next();
			    	++index;
			    	if(s instanceof Book) {
			    		Book book = (Book) s;
						System.out.println(index + " Book -" + book.getTitle() + " Category " +  book.getCategory() + " Cost " + book.getCost() + " Author " + book.getAuthor());
					}
					if (s instanceof DigitalVideoDisc) {
						DigitalVideoDisc dvd = (DigitalVideoDisc) s;
						System.out.println(index + " DigitalVideoDisc -" + dvd.getTitle() + " Category " +  dvd.getCategory() + " Cost " + dvd.getCost() + " Length " + dvd.getLength() + " Author " + dvd.getDirector());
					}
					if (s instanceof CompactDisc) {
						CompactDisc cd = (CompactDisc) s;
						System.out.println(index + " CD -" + cd.getTitle() + " Category " +  cd.getCategory() + " Cost " + cd.getCost() + " Length " + cd.getLength() + " Author " + cd.getArtist());
					}
			    }
			}
			System.out.println("Total cost: " + this.totalCost());
			System.out.println("***************************************************");
		}
	}
