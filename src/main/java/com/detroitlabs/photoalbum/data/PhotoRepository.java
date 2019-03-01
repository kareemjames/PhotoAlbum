package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoRepository {

    //TODO add arraylist of tags to constructor so I can create method to search by tags
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("MazdaRx7", LocalDate.of(2019, 2, 26), "yellowrx7.jpg", "A mini description"),
            new Photo("ToyotaSupra", LocalDate.of(2019, 2, 26), "blackmk4supra.jpg", "A mini description"),
            new Photo("HondaCivic", LocalDate.of(2019, 2, 26), "egcivichatch.jpg", "A mini description"),
            new Photo("AcuraIntegra", LocalDate.of(2019, 2, 26), "whitedc2typer.jpg", "A mini description"),
            new Photo("SubaruWrxSti", LocalDate.of(2019, 2, 26), "bluewrxsti.jpg", "A mini description"),
            new Photo("AcuraNsx", LocalDate.of(2019, 2, 26), "whitensxtyper.jpg", "A mini description"),
            new Photo("MitsubishiLancerEvo", LocalDate.of(2019, 2, 26), "blacklancerevo.jpg", "A mini description"),
            new Photo("ToyotaMr2", LocalDate.of(2019, 2, 26), "greenmr2.jpg", "A mini description"),
            new Photo("HondaCrx", LocalDate.of(2019, 2, 26), "greencrx.jpg", "A mini description"),
            new Photo("NissanSkylineGtr", LocalDate.of(2019, 2, 26), "bluegtr.jpg", "A mini description")
    );

    public List<Photo> getAllPhotos() {
        return ALL_PHOTOS;
    }

    public List<Photo> getPhotosAlphabeticallyByName() {

        List<Photo> sortedPhotosByName = new ArrayList<>();
        sortedPhotosByName.addAll(getAllPhotos());
        Comparator.comparing(Photo::getName).thenComparing(Photo::getName);
        Collections.sort(sortedPhotosByName, Comparator.comparing(Photo::getName));
        return sortedPhotosByName;
    }

    public List<Photo> getPhotosByDateUploaded() {
        List<Photo> sortedPhotosByDate = new ArrayList<>();
        sortedPhotosByDate.addAll(getAllPhotos());
        Comparator.comparing(Photo::getDateUploaded).thenComparing(Photo::getDateUploaded);
        Collections.sort(sortedPhotosByDate, Comparator.comparing(Photo::getDateUploaded));
        return sortedPhotosByDate;
    }

    public List<Photo> getPhotosByTag() {
        return null;
    }
}
