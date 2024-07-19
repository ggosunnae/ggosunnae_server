package com.ggosunnae_server.ggosunnae_server.api.entity.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "profile_url")
    private String profileUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "userType", nullable = false)
    private UserType userType;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Notification notification;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AuthProvider authProvider;

    @OneToMany(mappedBy = "user")
    private Set<DailyPost> dailyPosts;

    @OneToMany(mappedBy = "user")
    private Set<DailyPostLike> dailyPostLikes;

    @OneToMany(mappedBy = "user")
    private Set<DailyPostComment> dailyPostComments;

    @OneToMany(mappedBy = "user")
    private Set<DailyPostScrap> dailyPostScraps;

    @OneToMany(mappedBy = "user")
    private Set<LookbookPost> lookbookPosts;

    @OneToMany(mappedBy = "user")
    private Set<LookbookPostLike> lookbookPostLikes;

    @OneToMany(mappedBy = "user")
    private Set<LookbookPostComment> lookbookPostComments;

    @OneToMany(mappedBy = "user")
    private Set<LookbookPostScrap> lookbookPostScraps;
}

enum UserType {
    ADMIN,
    NORMAL
}