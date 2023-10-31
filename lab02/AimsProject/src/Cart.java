
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	// Add DVD to List
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
	// Remove From List
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
	// Calc Cost
	public double totalCost() {
		float sum=0;
		for(int i=0;i<qtyOrdered;i++) {
			sum+=itemOrdered[i].getCost();
		}
		return sum;
	}
}
