package com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DogBreed")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DogBreed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dog_breed_id")
    private Integer id;

    @Column(name = "dog_breed", length = 100)
    private String dogBreed;
}
