package com.nowij.nowLeague.api.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoundRankDTO {
    private int ranking;
    private String teamCode;
    private String teamName;
    private int winPoint;
}
