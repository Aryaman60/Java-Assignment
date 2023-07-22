package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.signup;

@Repository
public interface SignupRepository extends JpaRepository<signup, Long> {
    // Add custom query methods if needed
}
