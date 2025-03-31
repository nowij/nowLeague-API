package com.nowij.nowLeague.api.past.service.impl;

import com.nowij.nowLeague.api.common.model.RoundRankDTO;
import com.nowij.nowLeague.api.past.repository.PastRepository;
import com.nowij.nowLeague.api.past.service.PastService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PastServiceImpl implements PastService {
    private PastRepository pastRepository;

    public PastServiceImpl(PastRepository pastRepository) {
        this.pastRepository = pastRepository;
    }


    @Override
    public List<RoundRankDTO> selectPastWinpointByRound(Map<String, Object> requestParams) {
        return pastRepository.selectPastWinpointByRound(requestParams);
    }
}
