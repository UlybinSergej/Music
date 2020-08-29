package com.example.service;


import com.example.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenreService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Genre findGenre(int id) {
        Genre genre = mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Genre.class);
        return genre;
    }

    public List<Genre> findAllGenres() {
        List<Genre> genres = mongoTemplate.findAll(Genre.class, "genres");
        return genres;
    }
}
