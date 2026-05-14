package com.starting.workfinance.entity;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

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

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }
}
