package com.dand.start.dao;

import com.dand.start.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementDao extends JpaRepository<Achievement,Long> {
    public Achievement findById(long id);
    Long deleteById(long id);
}
