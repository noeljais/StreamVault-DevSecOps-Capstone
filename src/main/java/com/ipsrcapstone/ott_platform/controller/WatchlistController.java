package com.ipsrcapstone.ott_platform.controller;

import com.ipsrcapstone.ott_platform.entity.Watchlist;
import com.ipsrcapstone.ott_platform.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    @Autowired
    private WatchlistRepository watchlistRepository;

    // This endpoint fetches all saved watchlist items
    @GetMapping
    public List<Watchlist> getAllWatchlists() {
        return watchlistRepository.findAll();
    }

    // This endpoint connects a user to a movie
    @PostMapping
    public Watchlist addToWatchlist(@RequestBody Watchlist watchlist) {
        return watchlistRepository.save(watchlist);
    }
}