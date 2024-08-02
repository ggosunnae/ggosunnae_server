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

    @Column(name = "user_name")
    private String userName;

    @Column(name = "profile_image")
    private String profileImage;

    @Enumerated(EnumType.STRING)
    @Column(name = "userType", nullable = false)
    private UserType userType;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    @OneToMany(mappedBy = "user")
    private Set<PostLike> postLikes;

    @OneToMany(mappedBy = "user")
    private Set<PostComment> postComments;

    @OneToMany(mappedBy = "user")
    private Set<PostScrap> postScraps;

    @OneToOne(mappedBy = "user")
    private AuthProvider authProvider;

    @OneToOne(mappedBy = "user")
    private AlertApprove alertApprove;
}

enum UserType {
    ADMIN,
    NORMAL
}