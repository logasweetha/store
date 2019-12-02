package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.model.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long>{

	
}
