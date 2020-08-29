package com.example.model;


import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "genres")
public class Genre {
    @BsonId
    private int _id;
    private String genreTitle;
    private String description;

    public Genre() {
    }

    public Genre(int _id, String genreTitle, String description) {
        this._id = _id;
        this.genreTitle = genreTitle;
        this.description = description;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getGenreTitle() {
        return genreTitle;
    }

    public void setGenreTitle(String genreTitle) {
        this.genreTitle = genreTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "_id=" + _id +
                ", genreTitle='" + genreTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
