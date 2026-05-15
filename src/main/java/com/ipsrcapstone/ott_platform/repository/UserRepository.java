package com.ipsrcapstone.ott_platform.repository;

import com.ipsrcapstone.ott_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional; // Make sure this is imported!

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Changing this back to email to match your User.java file
    Optional<User> findByEmail(String email);
}