package com.nowij.nowLeague.api.schedule.controller;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.service.GameScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/game")
@RestController
public class GameScheduleController {

    private GameScheduleService gameScheduleService;

    public GameScheduleController(GameScheduleService gameScheduleService) {
        this.gameScheduleService = gameScheduleService;
    }

    @GetMapping("/schedule")
    public List<ScheduleDTO> selectGameSchedule(@RequestParam String season, @RequestParam String round) {
        return gameScheduleService.selectGameSchedule(season, round);
    }

    @GetMapping("/schedule/date")
    public ScheduleDTO selectSpecificGame(@RequestParam String date) {
        return gameScheduleService.selectSpecificGame(date);
    }
}
