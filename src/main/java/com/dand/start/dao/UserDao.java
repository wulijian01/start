package com.dand.start.dao;

import com.dand.start.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
