package com.ggosunnae_server.ggosunnae_server.api.entity.style;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

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
    private Integer id;

    @Column(name = "style_name")
    private String styleName;
}
