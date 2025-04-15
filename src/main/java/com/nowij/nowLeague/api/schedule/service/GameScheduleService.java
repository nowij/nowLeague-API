package com.nowij.nowLeague.api.schedule.service;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;

import java.util.List;

public interface GameScheduleService {
    List<ScheduleDTO> selectGameSchedule(String seasonCode, String gameRound);
    ScheduleDTO selectSpecificGame(String date);
}
