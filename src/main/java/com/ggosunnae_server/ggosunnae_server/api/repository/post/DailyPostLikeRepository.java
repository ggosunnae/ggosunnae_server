package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.DailyPostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyPostLikeRepository extends JpaRepository<DailyPostLike, Long> {
}
