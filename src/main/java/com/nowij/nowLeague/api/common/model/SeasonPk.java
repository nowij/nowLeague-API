package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class SeasonPk implements Serializable {
    @Column(name = "season_code")
    private String seasonCode;
    
    @Column(name = "gameRound")
    private String gameRound;
}
