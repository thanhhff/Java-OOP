package Lab.Ex1;

public class Order {

    // Moi lien ket trong so do UML;
    public static final int MAX_NUMBER_ORDER = 10;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];

    private int qtyOrdered = 0;

    private String dateOrdered = "2020/03/28";

    private static int nbOrders = 0;


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDER) {
            itemsOrdered[qtyOrdered++] = disc;
            nbOrders += 1;
        } else {
            System.out.println("Add Falled!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered >= MAX_NUMBER_ORDER) {
                System.out.println("Add Falled!");
                break;
            }
            itemsOrdered[qtyOrdered++] = dvdList[i];
            nbOrders += 1;
        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        String cmp = disc.getTitle();
        if (qtyOrdered == 0) {
            System.out.println("Remove Falled");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].getTitle().equals(cmp)) {
                    for (int j = i; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    itemsOrdered[qtyOrdered - 1] = null;
                    qtyOrdered--;
                    nbOrders -= 1;
                }
            }
        }
    }

    public float totalCost() {
//        System.out.println(nbOrders);
        float total_cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total_cost += itemsOrdered[i].getCost();
        }
        return total_cost;
    }

    public void showInformation() {
        System.out.println("----------------Order----------------");
        System.out.println(this.dateOrdered);
        for (int i = 0; i < nbOrders; i++) {
            System.out.println(i + 1 + ". " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("----------------End----------------");
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }
}
