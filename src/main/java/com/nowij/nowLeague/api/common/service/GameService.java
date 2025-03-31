package com.nowij.nowLeague.api.common.service;

import com.nowij.nowLeague.api.common.model.GameResultEntity;
import com.nowij.nowLeague.api.common.model.GameScheduleEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameService {
    List<GameScheduleEntity> selectGameSchedule(String seasonCode, String gameRound);
    ResponseEntity<GameResultEntity> selectGameResult(int gameNo);
}
