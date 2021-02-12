package com.autumnleaf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autumnleaf.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
