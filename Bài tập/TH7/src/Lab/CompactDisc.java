package Lab;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private int length;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
