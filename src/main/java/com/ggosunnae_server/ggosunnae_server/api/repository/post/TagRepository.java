package com.ggosunnae_server.ggosunnae_server.api.repository.post;

import com.ggosunnae_server.ggosunnae_server.api.entity.post.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}
