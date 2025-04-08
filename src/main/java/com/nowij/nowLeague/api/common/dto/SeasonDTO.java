package com.nowij.nowLeague.api.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeasonDTO {
    private String code;
    private String name;

    public SeasonDTO(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
