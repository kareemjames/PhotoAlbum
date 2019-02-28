package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class PhotoRepository {

    //TODO add arraylist of tags to constructor so I can create method to search by tags
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("MazdaRx7", LocalDate.of(2019, 2, 26),"yellowrx7.jpg"),
            new Photo("ToyotaSupra", LocalDate.of(2019, 2, 26), "blackmk4supra.jpg"),
            new Photo("HondaCivic", LocalDate.of(2019, 2, 26), "egcivichatch.jpg"),
            new Photo("AcuraIntegra", LocalDate.of(2019, 2, 26), "whitedc2typer.jpg"),
            new Photo("SubaruWrxSti", LocalDate.of(2019, 2, 26), "bluewrxsti.jpg"),
            new Photo("AcuraNsx", LocalDate.of(2019, 2, 26), "whitensxtyper.jpg"),
            new Photo("MitsubishiLancerEvo", LocalDate.of(2019, 2, 26), "blacklancerevo.jpg"),
            new Photo("ToyotaMr2", LocalDate.of(2019, 2, 26), "greenmr2.jpg"),
            new Photo("HondaCrx", LocalDate.of(2019, 2, 26), "greencrx.jpg"),
            new Photo("NissanSkylineGtr", LocalDate.of(2019, 2, 26), "bluegtr.jpg")
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
