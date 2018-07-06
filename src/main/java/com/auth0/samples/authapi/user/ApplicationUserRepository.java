package com.auth0.samples.authapi.user;

/**
 * Created by rsinghal on 7/5/2018.
 */
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}