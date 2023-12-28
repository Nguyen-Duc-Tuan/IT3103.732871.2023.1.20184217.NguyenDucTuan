package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.store.Store;

public class TestStore {
	public static void main(String args[]) {
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad","Animation","Roger Allers Dad",87,18.99f);
//		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar","Action","Cristiano Ronaldo",99,99.95f);	
		Store store = new Store();
		Cart cart = new Cart();
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		new StoreScreen(store,cart);
	}
}
