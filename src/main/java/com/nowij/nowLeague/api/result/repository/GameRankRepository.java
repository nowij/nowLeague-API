package com.nowij.nowLeague.api.result.repository;

import com.nowij.nowLeague.api.result.model.GameRankingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameRankRepository {
    List<GameRankingDTO> selectGameRanking(Map<String,Object> params);
}
