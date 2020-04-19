package Lab;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private int length;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {
        super();
    }

    public void addTrack(Track track) {
        if (!(tracks.contains(track))) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }

    public int getLength() {

        int length = 0;
        Track trackItem;

        for (Track track : tracks) {
            trackItem = track;
            length += trackItem.getLength();
        }
        return length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        // Tổng của các Track: thời lượng thật của DVD đó !
        System.out.println("Length: " + getLength());
    }
}

