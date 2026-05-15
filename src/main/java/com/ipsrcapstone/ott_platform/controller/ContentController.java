package com.ipsrcapstone.ott_platform.controller;

import com.ipsrcapstone.ott_platform.entity.Content;
import com.ipsrcapstone.ott_platform.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/content")
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    // This endpoint fetches all movies/shows from the database
    @GetMapping
    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }

    // This endpoint adds a new movie/show to the database
    @PostMapping
    public Content addContent(@RequestBody Content content) {
        return contentRepository.save(content);
    }
}