package com.nowij.nowLeague.api.result.service;

import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import com.nowij.nowLeague.api.result.model.GameResultEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameResultService {
    ResponseEntity<GameResultEntity> selectGameResult(int gameNo);
    ResponseEntity<List<GameRankingDTO>> selectGameRanking(String season);
}
