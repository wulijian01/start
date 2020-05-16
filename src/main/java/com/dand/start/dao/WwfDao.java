package com.dand.start.dao;

import com.dand.start.entity.Wwf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WwfDao extends JpaRepository<Wwf,Long> {
    public  Wwf findByPassword(String  password);
}
