package com.autumnleaf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autumnleaf.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
