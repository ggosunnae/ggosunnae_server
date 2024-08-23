package com.ggosunnae_server.ggosunnae_server.api.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "AlertApprove")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlertApprove {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alert_approve_id")
    private Long id;

    @Column(name = "comment_alert_status")
    private boolean commentAlertStatus;

    @Column(name = "marketing_alert_status")
    private boolean marketingAlertStatus;

    @Column(name = "is_pet_pick")
    private boolean isPetPick;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}

