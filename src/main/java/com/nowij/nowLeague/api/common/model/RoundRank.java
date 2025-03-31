package com.nowij.nowLeague.api.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoundRank {
    private int ranking;
    private String teamCode;
    private String teamName;
    private int winPoint;
}
