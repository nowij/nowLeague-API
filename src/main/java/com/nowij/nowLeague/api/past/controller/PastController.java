package com.nowij.nowLeague.api.past.controller;

import com.nowij.nowLeague.api.common.model.RoundRank;
import com.nowij.nowLeague.api.past.service.PastService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/past")
public class PastController {

    private PastService pastService;

    public PastController(PastService pastService) {
        this.pastService = pastService;
    }


    @GetMapping("/roundRank")
    public List<RoundRank> selectPastWinpointByRound(@RequestParam String season, @RequestParam String round) {
        Map<String, Object> requestParams = new HashMap<String, Object>();
        requestParams.put("seasonCode", season);
        requestParams.put("gameRound", round);
        return pastService.selectPastWinpointByRound(requestParams);
    }
}
