package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "LookbookDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LookbookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lookbook_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "style_point_id")
    private StylePoint stylePoint;

    @OneToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    private Post post;

    @Column(name = "style")
    private String style;

    @Column(name = "size")
    private String size;
}

