package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Table(name = "game_schedule")
@NoArgsConstructor
public class GameScheduleEntity {
    @Id
    @Column
    private int gameNo;
    @Column
    private Date gameDate;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "season_code", referencedColumnName = "season_code"),
            @JoinColumn(name = "game_round", referencedColumnName = "game_round")
    })
    private SeasonEntity seasonEntity;

    @Column
    private String homeCode;
    @Column
    private String awayCode;
    @Column
    private int homeSpoint;
    @Column
    private int awaySpoint;
}
