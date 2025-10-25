package com.example.ArtConnect.repository;
import com.example.ArtConnect.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ArtworkRepository extends MongoRepository<Artwork, String> {
    List<Artwork> findByArtistId(String artistId);
}