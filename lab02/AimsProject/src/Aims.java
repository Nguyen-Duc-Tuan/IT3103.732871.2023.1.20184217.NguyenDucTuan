public class Aims {
	public static void main(String args[]) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess","Animation","Roger Allers Son",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad","Animation","Roger Allers Dad",87,18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion Mother","Animation","Roger Allers Mother",19.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar","Action","Cristiano Ronaldo",99,99.95f);	
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd5);
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd4);
		System.out.println("Total cost is " + anOrder.totalCost());
	}
}
