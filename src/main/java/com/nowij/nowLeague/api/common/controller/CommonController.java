package com.nowij.nowLeague.api.common.controller;

import com.nowij.nowLeague.api.common.dto.SeasonDTO;
import com.nowij.nowLeague.api.common.model.RoundEntity;
import com.nowij.nowLeague.api.common.model.TeamEntity;
import com.nowij.nowLeague.api.common.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonController {
    private CommonService commonService;

    public CommonController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping("/seasons")
    public List<SeasonDTO> selectSeasons() {
        return commonService.selectAllSeasons();
    }

    @GetMapping("/today/season")
    public String selectTodaySeason(@RequestParam String month) {
        return commonService.selectTodaySeason(month);
    }

    @GetMapping("/rounds")
    public List<RoundEntity> selectRounds() {
        return commonService.selectAllRounds();
    }

    @GetMapping("/teams")
    public List<TeamEntity> selectTeams() {
        return commonService.selectAllTeams();
    }
}
