package com.nowij.nowLeague.api.gameResult.service;

import com.nowij.nowLeague.api.gameResult.model.GameResultEntity;
import org.springframework.http.ResponseEntity;

public interface GameResultService {
    ResponseEntity<GameResultEntity> selectGameResult(int gameNo);
}
