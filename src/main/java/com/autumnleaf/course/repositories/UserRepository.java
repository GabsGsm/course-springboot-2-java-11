package com.autumnleaf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autumnleaf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
