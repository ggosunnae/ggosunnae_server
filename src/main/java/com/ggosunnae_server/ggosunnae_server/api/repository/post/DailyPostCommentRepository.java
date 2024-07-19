package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.DailyPostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyPostCommentRepository extends JpaRepository<DailyPostComment, Long> {
}
