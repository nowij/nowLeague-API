package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.GameSchedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameScheduleRepository  {
    List<GameSchedule> selectGameSchedule(Map<String,Object> requestParams);
}
