package com.example.service;


import com.example.model.Album;
import com.example.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistService {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Artist> findArtistsByGenre(int id) {
        List<Artist> artists = mongoTemplate.find(Query.query(Criteria.where("genresIds").is(id)), Artist.class);
        return artists;
    }

    public List<Artist> findArtistsByAlbum(int id) {
        List<Artist> artists = mongoTemplate.find(Query.query(Criteria.where("albumsIds").is(id)), Artist.class);
        return artists;
    }

    public List<Artist> findAllArtists() {
        List<Artist> artists = mongoTemplate.findAll(Artist.class, "artists");
        return artists;
    }

    public Artist findArtist(int id) {
        Artist artist = mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Artist.class);
        return artist;
    }
}
