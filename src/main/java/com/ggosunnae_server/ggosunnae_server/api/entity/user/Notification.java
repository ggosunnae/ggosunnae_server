package com.ggosunnae_server.ggosunnae_server.api.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "Notification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alarm_id")
    private Long id;

    @Column(name = "is_comment")
    private boolean isComment;

    @Column(name = "is_marketing")
    private boolean isMarketing;

    @Column(name = "is_pet_pick")
    private boolean isPetPick;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
