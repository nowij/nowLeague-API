package com.nowij.nowLeague.api.common.service;

import com.nowij.nowLeague.api.common.dto.SeasonDTO;
import com.nowij.nowLeague.api.common.model.*;

import java.util.List;

public interface CommonService {
    List<SeasonDTO> selectAllSeasons();
    List<RoundEntity> selectAllRounds();
    List<TeamEntity> selectAllTeams();
    String selectTodaySeason(String month);
}
