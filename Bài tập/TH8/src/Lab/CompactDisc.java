package Lab;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable {
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

    public int getNumberOfTracks() {
        return this.tracks.size();
    }

    @Override
    public void play() {
        for (Track track : tracks) {
            System.out.println("Track title: " + track.getTitle()
                    + " - Track lenght: " + track.getLength());
        }

        // Tổng của các Track: thời lượng thật của DVD đó !
        System.out.println("Length: " + getLength());
    }

    @Override
    public int compareTo(Object o) {

        CompactDisc cd = (CompactDisc) o;

        int cp = Integer.compare(this.getNumberOfTracks(), cd.getNumberOfTracks());

        if (cp == 0) {
            return Integer.compare(this.getLength(), cd.getLength());
        }

        return cp;
    }
}

