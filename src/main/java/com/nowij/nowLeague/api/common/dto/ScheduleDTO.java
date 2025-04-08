package com.nowij.nowLeague.api.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ScheduleDTO {
    private int gameNo;
    private Date gameDate;
    private String seasonCode;
    private String gameRound;
    private String homeCode;
    private String homeName;
    private int homeSpoint;
    private String awayCode;
    private String awayName;
    private int awaySpoint;
}
