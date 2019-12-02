package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.model.entity.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long>{

}
