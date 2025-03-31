package com.nowij.nowLeague.api.past.service;

import com.nowij.nowLeague.api.common.model.RoundRank;

import java.util.List;
import java.util.Map;

public interface PastService {
    List<RoundRank> selectPastWinpointByRound(Map<String, Object> requestParams);
}
