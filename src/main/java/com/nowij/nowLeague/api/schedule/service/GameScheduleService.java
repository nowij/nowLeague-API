package com.nowij.nowLeague.api.schedule.service;

import com.nowij.nowLeague.api.common.dto.ResponsePageDTO;
import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.model.ReqScheduleParams;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameScheduleService {
    ResponseEntity<ResponsePageDTO> selectGameSchedule(ReqScheduleParams params, Pageable no);
    ScheduleDTO selectSpecificGame(String date);
}
