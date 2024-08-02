package com.ggosunnae_server.ggosunnae_server.api.entity.post;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Topic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Long id;

    @Column(name = "topic_name", length = 20)
    private String topicName;

    @OneToOne(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private GSNDetail gsnDetail;
}
