package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.model.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

}
