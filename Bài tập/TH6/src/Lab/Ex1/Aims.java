package Lab.Ex1;

public class Aims {

	public Aims() {
		super();
	}

	public static void main(String[] args) {
		// Create a new Order object

		Order anOrder = new Order();

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc();
		dvd1.setTitle("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);

		// add the dvd to the order
		anOrder.addMedia(dvd1);

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);

		//add the dvd to the order
		anOrder.addMedia(dvd2);

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd3 = new DigitalVideoDisc();
		dvd3.setTitle("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		// add the dvd to the order
		anOrder.addMedia(dvd3);

		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}
}