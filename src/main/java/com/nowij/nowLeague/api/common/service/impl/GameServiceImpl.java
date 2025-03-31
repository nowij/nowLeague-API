package com.nowij.nowLeague.api.common.service.impl;

import com.nowij.nowLeague.api.common.model.GameResultEntity;
import com.nowij.nowLeague.api.common.model.GameScheduleEntity;
import com.nowij.nowLeague.api.common.repository.GameRepository;
import com.nowij.nowLeague.api.common.repository.GameScheduleRepository;
import com.nowij.nowLeague.api.common.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;
    private GameScheduleRepository gameScheduleRepository;

    public GameServiceImpl(GameRepository gameRepository, GameScheduleRepository gameScheduleRepository) {
        this.gameRepository = gameRepository;
        this.gameScheduleRepository = gameScheduleRepository;
    }

    @Override
    public List<GameScheduleEntity> selectGameSchedule(String seasonCode, String gameRound) {
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("seasonCode", seasonCode);
        requestParams.put("gameRound", gameRound);
        return gameScheduleRepository.selectGameSchedule(requestParams);
    }

    @Override
    public ResponseEntity<GameResultEntity> selectGameResult(int gameNo) {
        GameResultEntity result = new GameResultEntity();
        Optional<GameResultEntity> gameResult = gameRepository.findByGameNo(gameNo);
        if (gameResult.isPresent()) {
            result = gameResult.get();
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
