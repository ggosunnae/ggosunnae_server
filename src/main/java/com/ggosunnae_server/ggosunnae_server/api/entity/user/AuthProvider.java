package com.ggosunnae_server.ggosunnae_server.api.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "AuthProvider")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_provider_id")
    private Long id;

    @Column(name = "social_type")
    private String socialType;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
