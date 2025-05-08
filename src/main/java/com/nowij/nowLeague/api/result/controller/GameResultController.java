package com.nowij.nowLeague.api.result.controller;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import com.nowij.nowLeague.api.result.model.GameResultEntity;
import com.nowij.nowLeague.api.result.model.ReqResultParams;
import com.nowij.nowLeague.api.result.service.GameResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/game")
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

    @GetMapping("/rank")
    public ResponseEntity<List<GameRankingDTO>> selectRanking(ReqResultParams params) {
        return gameResultService.selectGameRanking(params);
    }

    @GetMapping("/rank/graph")
    public ResponseEntity<List<GameRankingDTO>> selectRankingGraph(ReqResultParams params) {
        return gameResultService.selectGameRankingGraph(params);
    }

    @GetMapping("/result/team")
    public ResponseEntity<List<ScheduleDTO>> selectRecentResultByTeam(ReqResultParams params) {
        return gameResultService.selectRecentResultByTeam(params);
    }
}
