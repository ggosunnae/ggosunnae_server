package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "GSNDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GSNDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gsn_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "topic_id", referencedColumnName = "topic_id")
    private Topic topic;

    @OneToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    private Post post;
}

