package com.nowij.nowLeague.api.past.repository;

import com.nowij.nowLeague.api.common.model.RoundRankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PastRepository {
    List<RoundRankDTO> selectPastWinpointByRound(Map<String, Object> params);
}
