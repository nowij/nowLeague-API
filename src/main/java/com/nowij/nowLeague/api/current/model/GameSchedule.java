package com.nowij.nowLeague.api.current.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table(name = "game_schedule")
@NoArgsConstructor
public class GameSchedule {
    @Id
    @Column
    private int gameNo;

    @Column
    private Date gameDate;
//    @Column
//    private String gameRound;
//    @Column
//    private String seasonCode;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "season_code"),
            @JoinColumn(name = "game_round")
    })
    private Season season;

    @Column
    private String homeCode;
    @Column
    private String awayCode;
    @Column
    private int homeSpoint;
    @Column
    private int awaySpoint;
}
