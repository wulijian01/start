package com.dand.start.service;


import com.dand.start.dao.WwfDao;
import com.dand.start.entity.Wwf;
import com.dand.start.vo.WwfVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WwfService {
    @Autowired
    private WwfDao wwfDao;

    public Wwf getb(WwfVo vo){
        Wwf byPassword = wwfDao.findByPassword(vo.getPassword());
        return byPassword;
    }
}
