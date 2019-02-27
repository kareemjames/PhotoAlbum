package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhotoRepository {

    //TODO add arraylist of tags to constructor so I can create method to search by tags
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("MazdaRx7", LocalDate.of(2019, 2, 26)),
            new Photo("ToyotaSupra", LocalDate.of(2019, 2, 26)),
            new Photo("HondaCivic", LocalDate.of(2019, 2, 26)),
            new Photo("AcuraIntegra", LocalDate.of(2019, 2, 26)),
            new Photo("SubaruWrxSti", LocalDate.of(2019, 2, 26)),
            new Photo("AcuraNsx", LocalDate.of(2019, 2, 26)),
            new Photo("MitsubishiLancerEvo", LocalDate.of(2019, 2, 26)),
            new Photo("ToyotaMr2", LocalDate.of(2019, 2, 26)),
            new Photo("HondaCrx", LocalDate.of(2019, 2, 26)),
            new Photo("NissanSkylineGtr", LocalDate.of(2019, 2, 26))
    );

    public List<Photo> getAllPhotos() {
        return ALL_PHOTOS;
    }

    public List<Photo> getPhotosAlphabeticallyByName() {
        return null;
    }

    public List<Photo> getPhotosByDateUploaded() {
        return null;
    }

    public List<Photo> getPhotosByTag() {
        return null;
    }
}
