package com.nowij.nowLeague.api.result.repository;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import com.nowij.nowLeague.api.result.model.ReqResultParams;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameRankRepository {
    List<GameRankingDTO> selectGameRanking(ReqResultParams params);
    List<ScheduleDTO> selectRecentResultByTeam(ReqResultParams params);
    List<GameRankingDTO> selectGameRankingGraph(String season);
}
