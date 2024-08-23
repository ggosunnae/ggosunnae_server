package com.ggosunnae_server.ggosunnae_server.api.repository.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.user.AuthProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthProviderRepository extends JpaRepository<AuthProvider, Long> {
}
