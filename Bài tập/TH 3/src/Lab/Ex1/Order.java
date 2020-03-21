package Lab.Ex1;

public class Order {

    // Moi lien ket trong so do UML;
    public static final int MAX_NUMBER_ORDER = 10;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];

    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDER) {
            itemsOrdered[qtyOrdered++] = disc;
        } else {
            System.out.println("Add Falled!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        String cmp = disc.getTitle();
        if (qtyOrdered == 0) {
            System.out.println("Remove Falled");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].getTitle().equals(cmp)) {
                    for(int j = i; j < qtyOrdered - 1; j++)
                    {
                        itemsOrdered[j] = itemsOrdered[j+1];
                    }
                    itemsOrdered[qtyOrdered - 1] = null;
                    qtyOrdered--;
                }
            }
        }
    }

    public float totalCost() {
        float total_cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total_cost += itemsOrdered[i].getCost();
        }
        return total_cost;
    }


}
