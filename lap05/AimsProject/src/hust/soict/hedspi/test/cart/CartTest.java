package hust.soict.hedspi.test.cart;

import javax.naming.LimitExceededException;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String args[]) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad","Animation","Roger Allers Dad",87,18.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar","Action","Cristiano Ronaldo",99,99.95f);	
		try {
			anOrder.addMedia(dvd2);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			anOrder.addMedia(dvd3);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			anOrder.addMedia(dvd5);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.removeMedia(dvd2);
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.printAll();
	}
}
