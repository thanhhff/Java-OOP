package Lab;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc() {
        super();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}