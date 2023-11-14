package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class TestStore {
	public static void main(String args[]) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad","Animation","Roger Allers Dad",87,18.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar","Action","Cristiano Ronaldo",99,99.95f);	
		Store store = new Store();
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		store.removeDVD(dvd5);
		store.printOut();
	}
}
