package com.nowij.nowLeague.api.gameResult.controller;

import com.nowij.nowLeague.api.gameResult.model.GameResultEntity;
import com.nowij.nowLeague.api.gameResult.service.GameResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/game")
@RestController
public class GameResultController {
    private GameResultService gameResultService;

    public GameResultController(GameResultService gameResultService) {
        this.gameResultService = gameResultService;
    }

    @GetMapping("/result")
    public ResponseEntity<GameResultEntity> selectGameResult(@RequestParam int no) {
        return gameResultService.selectGameResult(no);
    }
}
