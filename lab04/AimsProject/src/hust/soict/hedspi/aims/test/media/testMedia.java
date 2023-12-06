package hust.soict.hedspi.aims.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class testMedia {
	
	public static void main(String args[]) {
		ArrayList<Track> tracks = new ArrayList<Track> ();
		ArrayList<String> authors = new ArrayList<String> ();
		String author = new String("Nghiem Dinh Minh");
		authors.add(author);
		Track conMuaNgangQua = new Track("Con Mua Ngang Qua",15);
		tracks.add(conMuaNgangQua);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		CompactDisc cd1 =  new 	CompactDisc("Conan" ,"Anime",100,"NghiemDinhMinh",99, "Son Tung MTP", tracks );
		Book book1 = new Book("Cuoc chien cua nhung vi than","Phim vien tuong",99,authors);
		List<Media> mediae = new ArrayList<Media>();
		mediae.add(cd1);
		mediae.add(dvd2);
		mediae.add(book1);
		for(Media m:mediae) {
			System.out.println(m.toString());
		}
	}
}
