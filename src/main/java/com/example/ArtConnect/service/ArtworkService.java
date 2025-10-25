package com.example.ArtConnect.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ArtConnect.model.Artwork;
import com.example.ArtConnect.repository.ArtworkRepository;

@Service
public class ArtworkService {
    private final ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    public Artwork save(Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    public List<Artwork> getAll() {
        return artworkRepository.findAll();
    }

    public List<Artwork> getByArtist(String artistId) {
        return artworkRepository.findByArtistId(artistId);
    }

	public Artwork getArtworkById(String id) {
		return artworkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artwork not found with id: " + id));
		
	}

	public void deleteById(String artworkId) {
		artworkRepository.deleteById(artworkId);
	}
}
 
