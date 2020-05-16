package com.dand.start.controller;


import com.dand.start.entity.Achievement;
import com.dand.start.service.AchievementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin
public class AchievementController {
    @Autowired
    private AchievementService achievementService;

    @GetMapping("/dxe/fen")
    public Page<Achievement> geta(@RequestParam Integer pageNo,@RequestParam Integer pageSize){
        Page<Achievement> ull = achievementService.getb(pageNo - 1, pageSize);
        return ull;

    }
    @PostMapping("/add")
    public Long savecount(@RequestBody Achievement achievement){
        Achievement ac = achievementService.getc(achievement);
        return ac.getId();
    }
    @GetMapping("/byId")
    public Achievement geth(@RequestParam(value = "id") long id){
        Achievement ac = achievementService.getk(id);
        return ac;
    }
    @DeleteMapping("/delete")
    public Long geto(@RequestParam(value = "id") long id){
        Long dele = achievementService.del(id);
        return dele;
    }
}
