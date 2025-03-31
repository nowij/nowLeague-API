package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.GameScheduleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameScheduleRepository  {
    List<GameScheduleEntity> selectGameSchedule(Map<String,Object> requestParams);
}
