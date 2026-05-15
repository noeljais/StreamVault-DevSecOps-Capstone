package com.ipsrcapstone.ott_platform.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "s3_thumbnail_url")
    private String s3ThumbnailUrl;

    @Column(name = "cloudfront_video_url")
    private String cloudfrontVideoUrl;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getS3ThumbnailUrl() { return s3ThumbnailUrl; }
    public void setS3ThumbnailUrl(String s3ThumbnailUrl) { this.s3ThumbnailUrl = s3ThumbnailUrl; }
    public String getCloudfrontVideoUrl() { return cloudfrontVideoUrl; }
    public void setCloudfrontVideoUrl(String cloudfrontVideoUrl) { this.cloudfrontVideoUrl = cloudfrontVideoUrl; }
}