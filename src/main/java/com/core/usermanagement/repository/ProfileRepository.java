package com.core.usermanagement.repository;

import com.core.usermanagement.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Add custom queries for profile management if needed
}
