package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "StylePoint")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StylePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "style_point_id")
    private Long id;

    @Column(name = "style_name", length = 20)
    private String styleName;
}

