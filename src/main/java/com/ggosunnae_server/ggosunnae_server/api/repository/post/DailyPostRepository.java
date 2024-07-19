package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.DailyPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyPostRepository extends JpaRepository<DailyPost, Long> {
}
