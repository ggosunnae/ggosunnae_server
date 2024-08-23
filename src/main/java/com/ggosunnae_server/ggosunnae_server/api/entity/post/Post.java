package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.LookbookDetail;
import com.ggosunnae_server.ggosunnae_server.api.entity.post.GSNDetail;
import com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed.DogBreed;
import com.ggosunnae_server.ggosunnae_server.api.entity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;


@Entity
@Table(name = "Post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "dog_breed_id")
    private DogBreed dogBreed;

    @Column(name = "image_url", length = 500)
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "like_count")
    private int likeCount;

    @Column(name = "is_lookbook")
    private boolean isLookbook;

    @Column(name = "is_GSN")
    private boolean isGSN;

    @OneToMany(mappedBy = "post")
    private Set<PostComment> comments;

    @OneToMany(mappedBy = "post")
    private Set<PostLike> likes;

    @OneToMany(mappedBy = "post")
    private Set<PostScrap> scraps;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private LookbookDetail lookbookDetail;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private GSNDetail gsnDetail;
}
