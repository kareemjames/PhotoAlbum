package com.detroitlabs.photoalbum.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Photo {

    private String name;
    private LocalDate dateUploaded;
    private String imageName;
    private String miniDescription;
    private List<String> tags;

    public Photo(String name, LocalDate dateUploaded, String imageName, String miniDescription) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.imageName = imageName;
        this.miniDescription = miniDescription;
        tags = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", dateUploaded=" + dateUploaded +
                ", tags=" + tags +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getMiniDescription() {
        return miniDescription;
    }

    public void setMiniDescription(String miniDescription) {
        this.miniDescription = miniDescription;
    }
}
