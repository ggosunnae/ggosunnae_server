package com.ggosunnae_server.ggosunnae_server.api.repository.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.user.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}
