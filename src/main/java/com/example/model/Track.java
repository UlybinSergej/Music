package com.example.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "tracks")
public class Track {
    @BsonId
    private int _id;
    private String title;
    private List<Integer> genresIds;
    private List<Integer> artistsIds;
    private List<Integer> albumsIds;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getGenresIds() {
        return genresIds;
    }

    public void setGenresIds(List<Integer> genresIds) {
        this.genresIds = genresIds;
    }

    public List<Integer> getArtistsIds() {
        return artistsIds;
    }

    public void setArtistsIds(List<Integer> artistsIds) {
        this.artistsIds = artistsIds;
    }

    public List<Integer> getAlbumsIds() {
        return albumsIds;
    }

    public void setAlbumsIds(List<Integer> albumsIds) {
        this.albumsIds = albumsIds;
    }

    @Override
    public String toString() {
        return "Track{" +
                "_id=" + _id +
                ", title='" + title + '\'' +
                ", genreIds=" + genresIds +
                ", artistsIds=" + artistsIds +
                ", albumsIds=" + albumsIds +
                '}';
    }
}
