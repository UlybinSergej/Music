package com.example.service;


import com.example.model.Artist;
import com.example.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrackService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Track findTrack(int id) {
        Track track = mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Track.class);
        return track;
    }

    public List<Track> findTracksByArtist(int id) {
        List<Track> tracks = mongoTemplate.find(Query.query(Criteria.where("ArtistsIds").is(id)), Track.class);
        return tracks;
    }

    public List<Track> findTracksByGenre(int id) {
        List<Track> tracks = mongoTemplate.find(Query.query(Criteria.where("genresIds").is(id)), Track.class);
        return tracks;
    }

    public List<Track> findTracksByAlbum(int id) {
        List<Track> tracks = mongoTemplate.find(Query.query(Criteria.where("AlbumsIds").is(id)), Track.class);
        return tracks;
    }

    public List<Track> findAllTracks() {
        List<Track> tracks = mongoTemplate.findAll(Track.class, "tracks");
        return tracks;
    }
}
