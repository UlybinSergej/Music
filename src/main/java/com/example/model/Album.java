package com.example.model;


import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "albums")
public class Album {
    @BsonId
    private int _id;
    private String title;
    private List<Integer> artistsIds;
    private List<Integer> tracksIds;
    private List<Integer> genresIds;
    private String description;
    private List<String> picture;

    public Album() {
    }

    public Album(int _id, String title, List<Integer> artistsIds, List<Integer> tracksIds, List<Integer> genresIds, String description, List<String> picture) {
        this._id = _id;
        this.title = title;
        this.artistsIds = artistsIds;
        this.tracksIds = tracksIds;
        this.genresIds = genresIds;
        this.description = description;
        this.picture = picture;
    }

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

    public List<Integer> getArtistsIds() {
        return artistsIds;
    }

    public void setArtistsIds(List<Integer> artistsIds) {
        this.artistsIds = artistsIds;
    }

    public List<Integer> getTracksIds() {
        return tracksIds;
    }

    public void setTracksIds(List<Integer> tracksIds) {
        this.tracksIds = tracksIds;
    }

    public List<Integer> getGenresIds() {
        return genresIds;
    }

    public void setGenresIds(List<Integer> genresIds) {
        this.genresIds = genresIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPicture() {
        return picture;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Album{" +
                "_id=" + _id +
                ", title='" + title + '\'' +
                ", artistsIds=" + artistsIds +
                ", tracksIds=" + tracksIds +
                ", genresIds=" + genresIds +
                ", description='" + description + '\'' +
                ", picture=" + picture +
                '}';
    }
}
