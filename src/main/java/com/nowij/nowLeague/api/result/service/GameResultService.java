package com.nowij.nowLeague.api.result.service;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import com.nowij.nowLeague.api.result.model.GameResultEntity;
import com.nowij.nowLeague.api.result.model.ReqResultParams;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameResultService {
    ResponseEntity<GameResultEntity> selectGameResult(int gameNo);
    ResponseEntity<List<GameRankingDTO>> selectGameRanking(ReqResultParams params);
    ResponseEntity<List<GameRankingDTO>> selectGameRankingGraph(ReqResultParams params);
    ResponseEntity<List<ScheduleDTO>> selectRecentResultByTeam(ReqResultParams params);
}
