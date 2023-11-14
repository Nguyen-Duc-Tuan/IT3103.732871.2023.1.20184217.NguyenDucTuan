package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

//import java.util.ArrayList;
//import java.util.Arrays;
//Implement the Store class
public class Store {
	private static final int MAX_ITEM_IN_STORE = 99;
	private static int currentNumberInStore = 0;
	private DigitalVideoDisc itemsInStore[];

	public Store() {
		this.itemsInStore = new DigitalVideoDisc[MAX_ITEM_IN_STORE];
	}
	// Add DVD to store
	public void addDVD(DigitalVideoDisc dvd) {
		++currentNumberInStore;
		itemsInStore[currentNumberInStore-1] = dvd;
	}
	// Delete DVD to store
	public void removeDVD(DigitalVideoDisc dvd) {
		for(int i=0;i<currentNumberInStore;i++) {
			if(itemsInStore[i].isMatch(dvd.getTitle()) == 1) {
				for(int j = i;j<currentNumberInStore;j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				itemsInStore[currentNumberInStore] = null;
				currentNumberInStore--;
				return;
			}
		}
		System.out.println("Not Found this disc");
	}
	public void printOut() {
		for(int i=0;i<currentNumberInStore;i++) {
			System.out.println(itemsInStore[i].getTitle());
		}
	}
}
