package com.nowij.nowLeague.api.result.service.impl;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import com.nowij.nowLeague.api.result.model.GameResultEntity;
import com.nowij.nowLeague.api.result.model.ReqResultParams;
import com.nowij.nowLeague.api.result.repository.GameRankRepository;
import com.nowij.nowLeague.api.result.repository.GameResultRepository;
import com.nowij.nowLeague.api.result.service.GameResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameResultServiceImpl implements GameResultService {
    private GameResultRepository gameResultRepository;
    private GameRankRepository gameRankRepository;

    public GameResultServiceImpl(GameResultRepository gameResultRepository, GameRankRepository gameRankRepository) {
        this.gameResultRepository = gameResultRepository;
        this.gameRankRepository = gameRankRepository;
    }

    @Override
    public ResponseEntity<GameResultEntity> selectGameResult(int gameNo) {
        GameResultEntity result = new GameResultEntity();
        Optional<GameResultEntity> gameResult = gameResultRepository.findByGameNo(gameNo);
        if (gameResult.isPresent()) {
            result = gameResult.get();
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<GameRankingDTO>> selectGameRanking(ReqResultParams params) {
        return new ResponseEntity<>(gameRankRepository.selectGameRanking(params), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ScheduleDTO>> selectRecentResultByTeam(ReqResultParams params) {
        return new ResponseEntity<>(gameRankRepository.selectRecentResultByTeam(params), HttpStatus.OK);
    }
}
