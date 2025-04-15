package com.nowij.nowLeague.api.schedule.service.impl;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.repository.GameScheduleRepository;
import com.nowij.nowLeague.api.schedule.service.GameScheduleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GameScheduleServiceImpl implements GameScheduleService {

    private GameScheduleRepository gameScheduleRepository;

    public GameScheduleServiceImpl(GameScheduleRepository gameScheduleRepository) {
        this.gameScheduleRepository = gameScheduleRepository;
    }

    @Override
    public List<ScheduleDTO> selectGameSchedule(String seasonCode, String gameRound) {
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("seasonCode", seasonCode);
        requestParams.put("gameRound", gameRound);
        return gameScheduleRepository.selectGameSchedule(requestParams);
    }

    @Override
    public ScheduleDTO selectSpecificGame(String date) {
        return gameScheduleRepository.selectSpecificGame(date);
    }
}
