package com.example.service;

import com.example.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlbumService {
    @Autowired
    MongoTemplate mongoTemplate;

    public List<Album> findAlbumsByArtist(int id) {
        List<Album> albums = mongoTemplate.find(Query.query(Criteria.where("artistsIds").is(id)), Album.class);
        return albums;
    }

    public List<Album> findAlbumsByGenre(int id) {
        List<Album> albums = mongoTemplate.find(Query.query(Criteria.where("genresIds").is(id)), Album.class);
        return albums;
    }

    public List<Album> findAlbumsByTrack(int id) {
        List<Album> albums = mongoTemplate.find(Query.query(Criteria.where("tracksIds").is(id)), Album.class);
        return albums;
    }

    public Album findAlbum(int id) {
        Album album = mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Album.class);
        return album;
    }

    public List<Album> findAllAlbums() {
        List<Album> albums = mongoTemplate.findAll(Album.class, "albums");
        return albums;
    }
}
