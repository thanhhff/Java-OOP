package Lab.Ex1;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();

        // Create a new DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger");
        dvd1.setLength(87);

        anOrder.addDigitalVideoDisc(dvd1);

        // dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        // dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);


        DigitalVideoDisc[] dvd = new DigitalVideoDisc[3];
        dvd[0] = dvd1;
        dvd[1] = dvd2;
        dvd[2] = dvd3;

        anOrder.addDigitalVideoDisc(dvd);


//        // Total sum cost before remove
//        System.out.println("Total Cost: " + anOrder.totalCost());
//
//        // Remove dvd1
//        anOrder.removeDigitalVideoDisc(dvd1);
//        // Total sum cost after remove dvd1
//        System.out.println("Total Cost: " + anOrder.totalCost());

        anOrder.showInformation();

    }


}
