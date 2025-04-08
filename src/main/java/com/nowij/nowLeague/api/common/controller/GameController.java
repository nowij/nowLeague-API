package com.nowij.nowLeague.api.common.controller;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.common.model.GameResultEntity;
import com.nowij.nowLeague.api.common.model.GameScheduleEntity;
import com.nowij.nowLeague.api.common.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/game")
@RestController
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/schedule")
    public List<ScheduleDTO> selectGameSchedule(@RequestParam String season, @RequestParam String round) {
        return gameService.selectGameSchedule(season, round);
    }

    @GetMapping("/schedule/date")
    public ScheduleDTO selectSpecificGame(@RequestParam String date) {
        return gameService.selectSpecificGame(date);
    }

    @GetMapping("/result")
    public ResponseEntity<GameResultEntity> selectGameResult(@RequestParam int no) {
        return gameService.selectGameResult(no);
    }
}
