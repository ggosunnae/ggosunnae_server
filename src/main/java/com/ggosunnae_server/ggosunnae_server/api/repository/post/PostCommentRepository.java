package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
