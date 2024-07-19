package com.ggosunnae_server.ggosunnae_server.api.repository.user;

import com.ggosunnae_server.ggosunnae_server.api.entity.user.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
