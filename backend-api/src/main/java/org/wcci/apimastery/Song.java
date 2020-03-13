package org.wcci.apimastery;

import javax.persistence.*;

@Entity

public class Song {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private Album album;

    protected Song(){

    }



    public Song(String name,Artist artist,Album album) {
        this.name=name;
        this.artist=artist;
        this.album=album;



    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }
}




