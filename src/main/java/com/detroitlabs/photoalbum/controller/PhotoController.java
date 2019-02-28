package com.detroitlabs.photoalbum.controller;

import com.detroitlabs.photoalbum.data.PhotoRepository;
import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class PhotoController {

    Photo photo;

    @Autowired
    PhotoRepository photoRepository;

    @RequestMapping("/")
    public String displayAllPhotos(ModelMap modelMap) {
        List<Photo> allPhotos = photoRepository.getAllPhotos();

        modelMap.put("allPhotos", allPhotos);
        return "home";
    }
}
