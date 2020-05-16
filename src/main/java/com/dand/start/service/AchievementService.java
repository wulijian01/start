package com.dand.start.service;

import com.dand.start.dao.AchievementDao;
import com.dand.start.entity.Achievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AchievementService {
    @Autowired
    private AchievementDao achievementDao;

    public Page<Achievement> getb(Integer pageNo,Integer pageSize){
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        Page<Achievement> all = achievementDao.findAll(pageable);
        return  all;
    }
    public Achievement getc(Achievement achievement){
        Achievement achievement1 = achievementDao.saveAndFlush(achievement);
        return  achievement1;
    }
    public Achievement getk(long id){
        Achievement byId = achievementDao.findById(id);
        return  byId;
    }
    public Long del(long id){
        Long th= achievementDao.deleteById(id);
        return th;
    }
}
