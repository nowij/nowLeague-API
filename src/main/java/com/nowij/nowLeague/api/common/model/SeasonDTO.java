package com.nowij.nowLeague.api.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeasonDTO {
    private String seasonCode;
    private String seasonName;

    public SeasonDTO(String seasonCode, String seasonName) {
        this.seasonCode = seasonCode;
        this.seasonName = seasonName;
    }
}
