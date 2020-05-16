package com.dand.start.service;

import com.dand.start.dao.MacthDao;
import com.dand.start.entity.RaceMatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    private MacthDao macthDao;

    public Page<RaceMatch> getb(Integer pageNo, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        Page<RaceMatch> all = macthDao.findAll(pageable);
        return all;
    }
    public RaceMatch savedate(RaceMatch raceMatch){
        RaceMatch raceMatch1 = macthDao.saveAndFlush(raceMatch);
        return raceMatch1;

    }
    public RaceMatch getf(long id){
        RaceMatch byId = macthDao.findById(id);
        return byId;
    }
    public Long dele(long id){
        Long aLong = macthDao.deleteById(id);
        return  aLong;
    }
}
