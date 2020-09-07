package com.example.service;


import com.example.model.Resource;
import com.example.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class ResourceService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Resource findPicture(int id) {
        Resource picture = mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Resource.class);
        return picture;
    }
}
