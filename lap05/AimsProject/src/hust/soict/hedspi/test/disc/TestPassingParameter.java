package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
   public static void main(String[] args) {
	   	DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad","Animation","Roger Allers Dad",87,18.99f);
        
        swap(dvd2, dvd3);
        
        System.out.println("jungle dvd title: " + dvd2.getTitle());
        System.out.println("cinderel dvd title: " + dvd3.getTitle());
        
        changeTitle(dvd2, dvd3.getTitle());
        
        System.out.println("jungle dvd title: " + dvd2.getTitle());
    }



   public static void swap(Object dvd1,  Object dvd2) {
	   if(dvd1 instanceof DigitalVideoDisc && dvd2 instanceof DigitalVideoDisc) {
		   String name = ((DigitalVideoDisc) dvd1).getTitle();
		   ((DigitalVideoDisc) dvd1).setTitle(((DigitalVideoDisc) dvd2).getTitle());
		   ((DigitalVideoDisc) dvd2).setTitle(name);
	   }
    }	



   public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}