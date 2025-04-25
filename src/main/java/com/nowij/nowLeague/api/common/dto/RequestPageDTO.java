package com.nowij.nowLeague.api.common.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Builder
@Getter
@Setter
public class RequestPageDTO<T> {
    private Pageable pageable;
    private T requestParams;
}
