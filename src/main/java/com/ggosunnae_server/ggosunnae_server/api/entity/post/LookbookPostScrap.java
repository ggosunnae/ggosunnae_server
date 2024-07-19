package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "LookbookPostScrap")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LookbookPostScrap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scrap_id")
    private Long id;

    @Column(name = "is_scrap")
    private boolean isScrap;

    @ManyToOne
    @JoinColumn(name = "lookbook_id")
    private LookbookPost lookbookPost;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
