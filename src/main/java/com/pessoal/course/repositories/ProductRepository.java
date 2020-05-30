package com.pessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
