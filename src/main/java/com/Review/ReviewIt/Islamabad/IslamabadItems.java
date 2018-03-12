package com.Review.ReviewIt.Islamabad;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by abbott on 05-Mar-18.
 */
@Document (collection = "Islamabad")
public class IslamabadItems {

    private String id;
    private String name;
    private String rating;
    private String description;
    private String images;

    public IslamabadItems() {
    }

    public IslamabadItems(String name, String rating, String description, String images) {
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
