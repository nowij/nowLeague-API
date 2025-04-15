package com.nowij.nowLeague.api.schedule.repository;

import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameScheduleRepository  {
    List<ScheduleDTO> selectGameSchedule(Map<String,Object> requestParams);
    ScheduleDTO selectSpecificGame(String date);
}
