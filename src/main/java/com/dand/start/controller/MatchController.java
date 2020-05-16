package com.dand.start.controller;

import com.dand.start.entity.RaceMatch;
import com.dand.start.service.MatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping("/dxe/user")
    public  Page<RaceMatch> geta(@RequestParam Integer pageNo, @RequestParam Integer pageSize){
        Page<RaceMatch> p = matchService.getb(pageNo-1, pageSize);
        return p;
    }
    @PostMapping(value = "/dxe/add")
    public Long savecount(@RequestBody RaceMatch raceMatch){
        RaceMatch savedate1 = matchService.savedate(raceMatch);
        return savedate1.getId();
    }
    @GetMapping("/get/byId")
    public RaceMatch getd(@RequestParam(value = "id") long id){
        RaceMatch g= matchService.getf(id);
        return g;
    }

    @DeleteMapping("/delete/macth/byId")
    public Long del(@RequestParam("id") long id){
        Long te = matchService.dele(id);
        return te;

    }
}
