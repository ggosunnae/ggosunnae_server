package com.ggosunnae_server.ggosunnae_server.api.repository.dogbreed;

import com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed.DogBreed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogBreedRepository extends JpaRepository<DogBreed, Integer> {
}
