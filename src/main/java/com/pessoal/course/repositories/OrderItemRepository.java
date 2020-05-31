package com.pessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{	
}
