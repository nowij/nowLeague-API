package com.nowij.nowLeague.api.schedule.controller;

import com.nowij.nowLeague.api.common.dto.ResponsePageDTO;
import com.nowij.nowLeague.api.common.dto.ScheduleDTO;
import com.nowij.nowLeague.api.schedule.model.ReqScheduleParams;
import com.nowij.nowLeague.api.schedule.service.GameScheduleService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/game")
@RestController
public class GameScheduleController {

    private GameScheduleService gameScheduleService;

    public GameScheduleController(GameScheduleService gameScheduleService) {
        this.gameScheduleService = gameScheduleService;
    }

    @GetMapping("/schedule")
    public ResponseEntity<ResponsePageDTO> selectGameSchedule(ReqScheduleParams params, @PageableDefault(page = 0) Pageable page) {
        return gameScheduleService.selectGameSchedule(params, page);
    }

    @GetMapping("/schedule/date")
    public ScheduleDTO selectSpecificGame(@RequestParam String date) {
        return gameScheduleService.selectSpecificGame(date);
    }

}
