package com.autumnleaf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autumnleaf.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
