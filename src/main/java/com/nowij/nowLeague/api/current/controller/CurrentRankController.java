package com.nowij.nowLeague.api.current.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/current")
@RestController
public class CurrentRankController {
    // 순위 및 일정 조회
    @GetMapping("/rank/schedule")
    public void allRankAndSchedule() {

    }

    @GetMapping("/rank/schedule/{team}")
    public void teamRankAndSchedule(@PathVariable String team) {

    }

    // 그래프
}
