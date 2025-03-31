package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "season")
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(name = "pk.seasonCode", column = @Column(name = "season_code")),
        @AttributeOverride(name = "pk.gameRound", column = @Column(name = "game_round"))
})
@Getter
@Setter
public class SeasonEntity {
    @EmbeddedId
    private SeasonPk pk;
    @Column
    private String seasonName;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
}

