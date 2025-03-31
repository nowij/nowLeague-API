package com.nowij.nowLeague.api.common.service;

import com.nowij.nowLeague.api.common.model.GameResult;
import com.nowij.nowLeague.api.common.model.GameSchedule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameService {
    List<GameSchedule> selectGameSchedule(String seasonCode, String gameRound);
    ResponseEntity<GameResult> selectGameResult(int gameNo);
}
