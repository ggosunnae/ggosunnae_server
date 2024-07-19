package com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

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

    @Column(name = "dog_breed")
    private String dogBreed;
}
