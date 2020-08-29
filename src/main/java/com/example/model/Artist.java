package com.example.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "artists")
public class Artist {
    private int _id;
    private String name;
    private List<Integer> genresIds;
    private List<Integer> albumsIds;
    private List<Integer> tracksIds;
    private String description;
    private List<String> picture;

    public Artist() {
    }

    public Artist(int _id, String name, List<Integer> genresIds, List<Integer> albumsIds, List<Integer> tracksIds, String description, List<String> picture) {
        this._id = _id;
        this.name = name;
        this.genresIds = genresIds;
        this.albumsIds = albumsIds;
        this.tracksIds = tracksIds;
        this.description = description;
        this.picture = picture;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGenresIds() {
        return genresIds;
    }

    public void setGenresIds(List<Integer> genresIds) {
        this.genresIds = genresIds;
    }

    public List<Integer> getAlbumsIds() {
        return albumsIds;
    }

    public void setAlbumsIds(List<Integer> albumsIds) {
        this.albumsIds = albumsIds;
    }

    public List<Integer> getTracksIds() {
        return tracksIds;
    }

    public void setTracksIds(List<Integer> tracksIds) {
        this.tracksIds = tracksIds;
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
        return "Artist{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", genresIds=" + genresIds +
                ", albumsIds=" + albumsIds +
                ", tracksIds=" + tracksIds +
                ", description='" + description + '\'' +
                ", picture=" + picture +
                '}';
    }
}
