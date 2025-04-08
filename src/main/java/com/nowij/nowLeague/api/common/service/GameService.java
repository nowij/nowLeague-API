package com.nowij.nowLeague.api.common.service;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.common.model.GameResultEntity;
import com.nowij.nowLeague.api.common.model.GameScheduleEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameService {
    List<ScheduleDTO> selectGameSchedule(String seasonCode, String gameRound);
    ScheduleDTO selectSpecificGame(String date);
    ResponseEntity<GameResultEntity> selectGameResult(int gameNo);
}
