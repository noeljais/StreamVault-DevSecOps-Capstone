package com.ipsrcapstone.ott_platform.repository;

import com.ipsrcapstone.ott_platform.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
}