package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
   public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderelDVD = new DigitalVideoDisc("Cinderel");
        
        swap(jungleDVD, cinderelDVD);
        
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderel dvd title: " + cinderelDVD.getTitle());
        
        changeTitle(jungleDVD, cinderelDVD.getTitle());
        
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }


   // Swap to check pass by value or pass by reference
   public static void swap(Object dvd1,  Object dvd2) {
	   if(dvd1 instanceof DigitalVideoDisc && dvd2 instanceof DigitalVideoDisc) {
		   String name = ((DigitalVideoDisc) dvd1).getTitle();
		   ((DigitalVideoDisc) dvd1).setTitle(((DigitalVideoDisc) dvd2).getTitle());
		   ((DigitalVideoDisc) dvd2).setTitle(name);
	   }
    }	



   public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}