package com.nowij.nowLeague.api.result.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameRankingDTO {
    private int ranking;
    private String seasonCode;
    private String teamCode;
    private String teamName;
    private int winPoint;
}
