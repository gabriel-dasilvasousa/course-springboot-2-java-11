package com.pessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
