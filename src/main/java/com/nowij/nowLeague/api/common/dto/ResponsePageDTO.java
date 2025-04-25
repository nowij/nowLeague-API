package com.nowij.nowLeague.api.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponsePageDTO {
    private int page;
    private int pageSize;
    private int total;
    private List<?> content;
}
