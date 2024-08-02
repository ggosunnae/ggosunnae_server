package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
}
