package com.baseten.youtube.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String videoFile;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Video(Long id, String videoFile, String title, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.videoFile = videoFile;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
