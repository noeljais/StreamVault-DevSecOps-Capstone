package com.ipsrcapstone.ott_platform.repository;

import com.ipsrcapstone.ott_platform.entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
}