package Lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Aims {

    public Aims() {
        super();
    }

    public static void Menu() {
        System.out.println("---------------Menu-------------\n"
                + "1. Add new Book\n"
                + "2. Add new DVD\n"
                + "3. Add new CD\n"
                + "4. Display the items list of order\n"
                + "0. Quit!\n"
                + "Choose: ");
    }

//    public static void main(String[] args) {
//
//        int choose;
//
//        Scanner sc = new Scanner(System.in);
//
//        Order order = new Order();
//        do {
//            Menu();
//            choose = sc.nextInt();
//            switch (choose) {
//                case 1:
//                    Book book1 = new Book("Tuoi tre dang gia bao nhieu", "Song khac", 20f);
//                    Book book2 = new Book("Test 2", "Category2", 50f);
//                    order.addMedia(book1);
//                    order.addMedia(book2);
//                    break;
//                case 2:
//                    DigitalVideoDisc dvd1 = new DigitalVideoDisc();
//                    dvd1.setTitle("The Lion King");
//                    dvd1.setCategory("Animation");
//                    dvd1.setCost(19.95f);
//                    dvd1.setDirector("Roger Allers");
//                    dvd1.setLength(87);
//                    order.addMedia(dvd1);
//
//                    dvd1.play();
//
//                    break;
//
//
//                case 3:
//                    CompactDisc cd1 = new CompactDisc();
//                    cd1.setArtist("Trinh Cong Son");
//                    cd1.setLength(10);
//                    cd1.setCost(20f);
//
//                    Track track1 = new Track();
//                    track1.setTitle("Ngay ay");
//                    track1.setLength(5);
//                    cd1.addTrack(track1);
//
//                    order.addMedia(cd1);
//                    cd1.play();
//
//                    break;
//                case 4:
//                    order.showInformation();
//                    System.out.println("\nTotal Cost: " + order.totalCost());
//                    break;
//
//                case 0:
//                    System.out.println("Goodbye!");
//                    break;
//                default:
//                    System.out.println("Try again!");
//                    break;
//            }
//
//
//        } while (choose != 0);
//    }


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

        Collection collection = new ArrayList();
//        java.util.Collection collection = new java.util.ArrayList();
        collection.add(dvd2);
        collection.add(dvd3);
        collection.add(dvd1);

        java.util.Iterator iterator = collection.iterator();

        System.out.println("------------------------");
        System.out.println("The DVDs currenly in the order are: ");

        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
        }

        java.util.Collections.sort((java.util.List) collection);

        System.out.println("------------------------");
        System.out.println("The DVDs in sorted order are: ");

        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
        }

        System.out.println("------------------------");

//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
    }
}
