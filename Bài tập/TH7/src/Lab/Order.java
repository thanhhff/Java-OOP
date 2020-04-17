package Lab;

import java.util.ArrayList;

public class Order {

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public Order() {
        super();
    }

    public void addMedia(Media media) {
        if (!(itemsOrdered.contains(media))) {
            itemsOrdered.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        }
    }


    public float totalCost() {
        // store the number of discs currently in the order
        float total = 0;
        Media mediaItem;
        java.util.Iterator iter = itemsOrdered.iterator();

        while (iter.hasNext()) {
            mediaItem = (Media) (iter.next());
            total += mediaItem.getCost();
        }
        return total;
    }
}