package com.pessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
