package com.nowij.nowLeague.api.common.service.impl;

import com.nowij.nowLeague.api.common.model.RoundEntity;
import com.nowij.nowLeague.api.common.dto.SeasonDTO;
import com.nowij.nowLeague.api.common.model.TeamEntity;
import com.nowij.nowLeague.api.common.repository.RoundRepository;
import com.nowij.nowLeague.api.common.repository.SeasonRepository;
import com.nowij.nowLeague.api.common.repository.TeamRepository;
import com.nowij.nowLeague.api.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommonServiceImpl implements CommonService {
    private SeasonRepository seasonRepository;
    private TeamRepository teamRepository;
    private RoundRepository roundRepository;

    public CommonServiceImpl(SeasonRepository seasonRepository, TeamRepository teamRepository, RoundRepository roundRepository) {
        this.seasonRepository = seasonRepository;
        this.teamRepository = teamRepository;
        this.roundRepository = roundRepository;
    }

    @Override
    public List<SeasonDTO> selectAllSeasons() {
        List<Object[]> result = seasonRepository.selectAllSeasons();
        return result.stream()
                .map(row -> new SeasonDTO((String) row[0], (String) row[1]))
                .collect(Collectors.toList());
    }

    @Override
    public List<RoundEntity> selectAllRounds() {
        return roundRepository.findAll();
    }

    @Override
    public List<TeamEntity> selectAllTeams() {
        return teamRepository.findTeamsByUseYnOrderByCode("Y");
    }
}
