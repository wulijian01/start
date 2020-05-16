package com.dand.start.service;

import com.dand.start.dao.ThesisDao;
import com.dand.start.entity.Thesis;
import com.dand.start.vo.ThesisVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ThesisService {

    @Autowired
    private ThesisDao thesisDao;

    public Page<Thesis> getc(Integer pageNo, Integer pageSize) {
        Pageable pageable = (Pageable) PageRequest.of(pageNo, pageSize);
        Page<Thesis> all = thesisDao.findAll(pageable);
        return all;

    }
    public Thesis savecount(Thesis th){

        Thesis save = thesisDao.saveAndFlush(th);
        return save;
    }
  public Thesis geth(long id){
      Thesis byId = thesisDao.findById(id);
      return byId;
  }
  public Long del(long id){
      Long th= thesisDao.deleteById(id);
      return th;
  }
}
