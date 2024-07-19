package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed.DogBreed;
import com.ggosunnae_server.ggosunnae_server.api.entity.style.StylePoint;
import com.ggosunnae_server.ggosunnae_server.api.entity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "LookbookPost")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LookbookPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lookbook_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dog_breed_id")
    private DogBreed dogBreed;

    @ManyToOne
    @JoinColumn(name = "style_point_id")
    private StylePoint stylePoint;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "style")
    private String style;

    @Column(name = "size")
    private String size;

    @Column(name = "like_count")
    private Integer likeCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "lookbookPost")
    private Set<LookbookPostComment> comments;

    @OneToMany(mappedBy = "lookbookPost")
    private Set<LookbookPostLike> likes;

    @OneToMany(mappedBy = "lookbookPost")
    private Set<LookbookPostScrap> scraps;
}
