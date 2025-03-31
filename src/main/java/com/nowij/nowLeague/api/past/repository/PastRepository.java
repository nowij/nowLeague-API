package com.nowij.nowLeague.api.past.repository;

import com.nowij.nowLeague.api.common.model.RoundRank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PastRepository {
    List<RoundRank> selectPastWinpointByRound(Map<String, Object> params);
}
