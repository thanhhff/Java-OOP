package Lab;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {
    public DigitalVideoDisc() {
        super();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Object o) {
        DigitalVideoDisc dvd = (DigitalVideoDisc) o;
//        int cp = this.getTitle().compareTo(dvd.getTitle());
        int cp = Integer.compare(dvd.getTitle().length(), this.getTitle().length());
        if (cp == 0)
            return Float.compare(this.getCost(), dvd.getCost());
        return cp;
    }
}