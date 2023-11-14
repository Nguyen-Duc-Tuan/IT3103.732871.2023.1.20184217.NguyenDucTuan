package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is full");
		} else {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
			if(MAX_NUMBER_ORDERED - qtyOrdered <= 3 && MAX_NUMBER_ORDERED - qtyOrdered > 0) {
				System.out.println("The cart is almost full");
			}
		} 
	}
	// Method overloading with add List of DVD
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (int i=0; i<dvdList.length; i++) {
            if (qtyOrdered >= MAX_NUMBER_ORDERED) {
                System.out.println("The cart is almost full! All of DVD in this list can not be added");
                break;
            } else {
                itemOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered ++;
                System.out.println("The disc has been added");
            }
        }
    }
    // Method overloading add 2 DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            itemOrdered[qtyOrdered] = dvd1;
            itemOrdered[qtyOrdered + 1] = dvd2;
            qtyOrdered += 2;
            System.out.println("The disc has been added");
        }
    }
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0; i< qtyOrdered;i++) {
			if(itemOrdered[i].compare2Disc(disc)) {
				for(int j =i;j<qtyOrdered-1;j++) {
					itemOrdered[i] = itemOrdered[i+1];
				}
				qtyOrdered--;
				System.out.println("The disc has been deleted");
			}	
		}
	}
	public double totalCost() {
		float sum=0;
		for(int i=0;i<qtyOrdered;i++) {
			sum+=itemOrdered[i].getCost();
		}
		return sum;
	}
	public void printOut() {
		if(qtyOrdered != 0) {
			System.out.println("***********************CART***********************");
			System.out.println("Ordered Items:");
			for(int i=1;i<=qtyOrdered;i++) {
				if(itemOrdered[i-1].getLength() != 0) {
					System.out.println(i + " DVD -" + itemOrdered[i-1].getTitle() + " " +  itemOrdered[i-1].getCategory() + " " +
							 itemOrdered[i-1].getDirector() + " " +  itemOrdered[i-1].getLength());
				} else if (itemOrdered[i-1].getDirector() != null) {
					System.out.println(i + " DVD -" + itemOrdered[i-1].getTitle() + " " +  itemOrdered[i-1].getCategory() + " " +
							 itemOrdered[i-1].getDirector());
				} else if (itemOrdered[i-1].getCategory() != null) {
					System.out.println(i + " DVD -" + itemOrdered[i-1].getTitle() + " " +  itemOrdered[i-1].getCategory());
				} else System.out.println(i + " DVD -" + itemOrdered[i-1].getTitle());
			}
			System.out.println("Total cost: " + this.totalCost());
			System.out.println("***************************************************");
		}
	}

}
