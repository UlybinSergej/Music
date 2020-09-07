package com.example.model;


import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "webResource")
public class Resource {
    @BsonId
    String _id;
    String resource;

    public Resource() {

    }

    public Resource(String _id, String resource) {
        this._id = _id;
        this.resource = resource;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "_id='" + _id + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
