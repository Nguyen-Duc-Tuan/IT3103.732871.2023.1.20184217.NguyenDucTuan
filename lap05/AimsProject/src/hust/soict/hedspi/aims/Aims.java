package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.store.Store;

public class Aims {
	public static void main(String[] args) {
		Store testStore = new Store();
		Cart testCart = new Cart();
		List<String> authorList = new ArrayList<>();
		authorList.add("Dat");
		Book book1 = new Book("Dat", "Love", 13f, authorList);
		Book book2 = new Book("Ngan", "Action", 12f, authorList);
		CompactDisc cd1 = new CompactDisc("Mission Imposible", "Action", "Best Seller", 1, 26.5f, "Tuong");
		CompactDisc cd2 = new CompactDisc("Spider Man", "Film", "Best Movie", 7, 43.5f, "Ngan");
		Track track1 = new Track("SonTung1", 1);
		Track track2 = new Track("SonTung2", 2);
		Track track3 = new Track("SonTung3", 3);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		cd2.addTrack(track3);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers", 100, 18.99f);
		testStore.addMedia(dvd1);
		testStore.addMedia(dvd2);
		testStore.addMedia(cd1);
		testStore.addMedia(cd2);
		testStore.addMedia(book1);
		testStore.addMedia(book2);
		new StoreScreen(testStore, testCart);
	}
}
