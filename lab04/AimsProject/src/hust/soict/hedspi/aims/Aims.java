package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;

public class Aims{
	public static void showMenu() {

		System.out.println("AIMS: ");

		System.out.println("--------------------------------");

		System.out.println("1. View store");

		System.out.println("2. Update store");

		System.out.println("3. See current cart");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3");

	}

	public static void subShowMenu() {
		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. Add media");

		System.out.println("2. Remove media");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}
	public static void subMenuUpdateMedia() {
		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. Add book");

		System.out.println("2. Add DVD");
		
		System.out.println("3. Add CD");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3");

	}

	public static void storeMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. See a media’s details");

		System.out.println("2. Add a media to cart");

		System.out.println("3. Play a media");

		System.out.println("4. See current cart");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4");

	}

	public static void mediaDetailsMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Add to cart");

		System.out.println("2. Play");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void cartMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Filter medias in cart");

		System.out.println("2. Sort medias in cart");

		System.out.println("3. Remove media from cart");

		System.out.println("4. Play a media");

		System.out.println("5. Place order");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4-5");

	}
	public static void main(String args[]) {
		Store store = new Store();
		Cart cart = new Cart();
		Media m;
		int showMenuOption;
		try (Scanner keyboard = new Scanner(System.in)) {
			do {
				showMenu();
				showMenuOption = keyboard.nextInt();
				switch (showMenuOption) {
				case 1: {
					int storeMenuOption;
					do {
						store.printOut();
						storeMenu();
						storeMenuOption = keyboard.nextInt();
						switch (storeMenuOption) {
						case 1:
							String title;
							System.out.println("Enter the title:");
							title = keyboard.next();
							m = store.findByTitle(title);
							if (m != null)
								m.toString();

							int mediaDetailsMenuOption;
							do {
								mediaDetailsMenu();
								DigitalVideoDisc dvd;
								mediaDetailsMenuOption = keyboard.nextInt();
								switch (mediaDetailsMenuOption) {
								case 1:
									dvd = (DigitalVideoDisc) m;
									cart.addMedia(dvd);
									break;
								case 2:
									dvd = (DigitalVideoDisc) m;
									dvd.play();
									break;
								default:
									break;
								}
							} while (mediaDetailsMenuOption != 0);

							break;

						case 2:
							String category;
							String director;
							int length;	
							float cost;
							System.out.println("Enter the title:");
							title = keyboard.next();
							System.out.println("Enter the category:");
							category = keyboard.next();
							System.out.println("Enter the diretor:");
							director = keyboard.next();
							System.out.println("Enter the length:");
							length = keyboard.nextInt();
							System.out.println("Enter the cost:");
							cost = keyboard.nextFloat();
							m = new DigitalVideoDisc(title, category, director, length, cost);
							cart.addMedia(m);
							break;
						case 3:
							System.out.println("Enter the title:");
							title = keyboard.next();
							m = store.findByTitle(title);
							if (m != null) {
								DigitalVideoDisc dvd = (DigitalVideoDisc) m;
								dvd.play();
							}
							break;
						case 4:
							cart.printOut();
							break;
						default:
							break;
						}
					} while (storeMenuOption != 0);
					break;
				}
				case 2: {
					int option;
					do {
						subShowMenu();
						option = keyboard.nextInt();
						switch (option) {
						case 1:
							String title;
							String category;
							float cost;
							subMenuUpdateMedia();
							int optionsubMenuUpdateMedia =  keyboard.nextInt();
							System.out.println("Enter the title:");
							title = keyboard.next();
							System.out.println("Enter the category:");
							category = keyboard.next();
							System.out.println("Enter the cost:");
							cost = keyboard.nextFloat();
							switch(optionsubMenuUpdateMedia){
							case 1: 
								ArrayList<String> authors = new ArrayList<String>();
								System.out.println("Enter the authors:");
								String s = keyboard.next();
								authors.add(s);
								m = new Book(title,category,cost,authors);
								store.addMedia(m);
								break;
							case 2:
								String director;
								int length;
								System.out.println("Enter the director:");
								director = keyboard.next();
								System.out.println("Enter the length:");
								length = keyboard.nextInt();
								m = new DigitalVideoDisc(title,category,director,length,cost);
								store.addMedia(m);
								break;
							case 3:
								ArrayList<Track> tracks = new ArrayList<Track> ();
								String Artist;
								String TrackName;
								int TrackLength;
								System.out.println("Enter the director:");
								director = keyboard.next();
								System.out.println("Enter the length:");
								length = keyboard.nextInt();
								System.out.println("Enter the Artist:");
								Artist = keyboard.next();
								System.out.println("Enter the track name:");
								TrackName = keyboard.next();
								System.out.println("Enter the track length:");
								TrackLength = keyboard.nextInt();
								Track track = new Track(TrackName,TrackLength);
								tracks.add(track);
								m = new CompactDisc(title,category,cost,director,length,Artist,tracks);
								break;
							case 0:
								break;
						}	
							break;
						case 2:
							System.out.println("Enter the id:");
							int id = keyboard.nextInt();
							m = store.findById(id);
							if (m != null)
								store.removeMedia(m);
							break;
						default:
							break;
						}
					} while (option != 0);
					break;
				}
				case 3: {
					int cartMenuOption;
					do {
						cartMenu();
						cartMenuOption = keyboard.nextInt();
						switch (cartMenuOption) {
						case 1:

							break;

						case 2:

							break;

						case 3:

							break;

						case 4:

							break;

						case 5:

							break;
						default:
							break;
						}
						break;
					} while (cartMenuOption != 0);
				}

				default:
					break;
				}
			} while (showMenuOption != 0);
		}

	}
}
