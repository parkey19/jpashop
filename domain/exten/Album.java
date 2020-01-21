package domain.exten;

import javax.persistence.Entity;

/**
 * Created by parkey19 on 2020/01/21.
 */
@Entity
public class Album extends Item {
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
