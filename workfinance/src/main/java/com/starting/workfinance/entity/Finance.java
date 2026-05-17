package com.starting.workfinance.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@Entity
public class Finance {
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "value", nullable = false)
    private String value;
    @Column(name = "name", nullable = false)
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

}
