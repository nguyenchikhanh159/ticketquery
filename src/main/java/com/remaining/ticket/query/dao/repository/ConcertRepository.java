package com.remaining.ticket.query.dao.repository;

import com.remaining.ticket.query.dao.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Integer> {
}
