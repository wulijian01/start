package com.dand.start.dao;

import com.dand.start.entity.RaceMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MacthDao extends JpaRepository<RaceMatch, Long> {
    public RaceMatch findById(long id);

    public Long deleteById(long id);
}
