package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.dogbreed.DogBreed;
import com.ggosunnae_server.ggosunnae_server.api.entity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "DailyPost")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DailyPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "daily_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

    @ManyToOne
    @JoinColumn(name = "dog_breed_id")
    private DogBreed dogBreed;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "topic")
    private String topic;

    @Column(name = "like_count")
    private Integer likeCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "dailyPost")
    private Set<DailyPostComment> comments;

    @OneToMany(mappedBy = "dailyPost")
    private Set<DailyPostLike> likes;

    @OneToMany(mappedBy = "dailyPost")
    private Set<DailyPostScrap> scraps;
}
