package com.nowij.nowLeague.api.common.controller;

import com.nowij.nowLeague.api.common.model.GameResult;
import com.nowij.nowLeague.api.common.model.GameSchedule;
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
    public List<GameSchedule> selectGameSchedule(@RequestParam String season, @RequestParam String round) {
        return gameService.selectGameSchedule(season, round);
    }

    @GetMapping("/result")
    public ResponseEntity<GameResult> selectGameResult(@RequestParam int no) {
        return gameService.selectGameResult(no);
    }
}
