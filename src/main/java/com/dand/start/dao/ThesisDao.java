package com.dand.start.dao;


import com.dand.start.entity.Thesis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThesisDao extends JpaRepository<Thesis,Long> {
    public Thesis findById(long id);

    Long deleteById(long id);
}
