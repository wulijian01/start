package com.dand.start.controller;


import com.dand.start.entity.Thesis;
import com.dand.start.service.ThesisService;
import com.dand.start.vo.ThesisVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin
public class ThesisController {

    @Autowired
    private ThesisService thesisService;

    @GetMapping("/dxs/products")
    public Page<Thesis> geta(
            @RequestParam Integer pageNo,
            @RequestParam Integer pageSize){
        Page<Thesis> getc = thesisService.getc(pageNo-1, pageSize);
        return getc;
    }

    @PostMapping(value="/add/products")
    public Long getd(@RequestBody Thesis th){
        Thesis save2 = thesisService.savecount(th);
        return save2.getId();
    }

    @GetMapping("/get/products/byId")
    public Thesis getg(
            @RequestParam("id") long idqq){

        log.info("-----"+idqq);
        Thesis th = thesisService.geth(idqq);
        return th;
    }
    @DeleteMapping("/del/products/byId")
    public Long dele( @RequestParam long id){
        Long th = thesisService.del(id);
        return th;
    }
}
