package com.ggosunnae_server.ggosunnae_server.api.entity.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.Post;
import com.ggosunnae_server.ggosunnae_server.api.entity.post.PostComment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "Alert")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alert_id")
    private Long id;

    @Column(name = "is_read")
    private boolean isRead;

    @Column(name = "is_delete")
    private boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private PostComment postComment;
}
