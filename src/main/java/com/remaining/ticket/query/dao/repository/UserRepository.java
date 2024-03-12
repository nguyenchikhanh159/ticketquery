package com.remaining.ticket.query.dao.repository;

import com.remaining.ticket.query.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String username);
}
