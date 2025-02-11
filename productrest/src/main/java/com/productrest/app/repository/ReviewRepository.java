package com.productrest.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productrest.app.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
