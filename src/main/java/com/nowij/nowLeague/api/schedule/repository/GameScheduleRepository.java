package com.nowij.nowLeague.api.schedule.repository;

import com.nowij.nowLeague.api.common.dto.RequestPageDTO;
import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.model.ReqScheduleParams;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameScheduleRepository  {
    int selectGameScheduleCount(ReqScheduleParams params);
    List<ScheduleDTO> selectGameSchedule(RequestPageDTO pageDTO);
    ScheduleDTO selectSpecificGame(String date);
}
