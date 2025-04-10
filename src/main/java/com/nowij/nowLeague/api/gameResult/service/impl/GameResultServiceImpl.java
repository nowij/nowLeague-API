package com.nowij.nowLeague.api.gameResult.service.impl;

import com.nowij.nowLeague.api.gameResult.model.GameResultEntity;
import com.nowij.nowLeague.api.gameResult.repository.GameResultRepository;
import com.nowij.nowLeague.api.gameResult.service.GameResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameResultServiceImpl implements GameResultService {
    private GameResultRepository gameResultRepository;

    public GameResultServiceImpl(GameResultRepository gameResultRepository) {
        this.gameResultRepository = gameResultRepository;
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
}
