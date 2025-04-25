package com.nowij.nowLeague.api.schedule.service.impl;

import com.nowij.nowLeague.api.common.dto.RequestPageDTO;
import com.nowij.nowLeague.api.common.dto.ResponsePageDTO;
import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.model.ReqScheduleParams;
import com.nowij.nowLeague.api.schedule.repository.GameScheduleRepository;
import com.nowij.nowLeague.api.schedule.service.GameScheduleService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameScheduleServiceImpl implements GameScheduleService {

    private GameScheduleRepository gameScheduleRepository;

    public GameScheduleServiceImpl(GameScheduleRepository gameScheduleRepository) {
        this.gameScheduleRepository = gameScheduleRepository;
    }

    @Override
    public ResponseEntity<ResponsePageDTO> selectGameSchedule(ReqScheduleParams params, Pageable page) {
        RequestPageDTO<?> pageDTO = RequestPageDTO.builder()
                .requestParams(params)
                .pageable(page)
                .build();

        List<ScheduleDTO> list = gameScheduleRepository.selectGameSchedule(pageDTO);
        int total = gameScheduleRepository.selectGameScheduleCount(params);
        ResponsePageDTO result = new ResponsePageDTO();
        result.setPageSize(page.getPageSize());
        result.setPage((int) page.getOffset());
        result.setContent(list);
        result.setTotal(total);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ScheduleDTO selectSpecificGame(String date) {
        return gameScheduleRepository.selectSpecificGame(date);
    }
}
