package com.ggosunnae_server.ggosunnae_server.api.repository.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
