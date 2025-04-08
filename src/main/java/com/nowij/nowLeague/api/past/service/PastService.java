package com.nowij.nowLeague.api.past.service;

import com.nowij.nowLeague.api.common.dto.RoundRankDTO;

import java.util.List;
import java.util.Map;

public interface PastService {
    List<RoundRankDTO> selectPastWinpointByRound(Map<String, Object> requestParams);
}
