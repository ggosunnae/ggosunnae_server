package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.LookbookPostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LookbookPostCommentRepository extends JpaRepository<LookbookPostComment, Long> {
}
