package com.remaining.ticket.query.dao.repository;

import com.remaining.ticket.query.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
