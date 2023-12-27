package com.nowij.nowLeague.api.current.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table(name = "game_result")
@NoArgsConstructor
public class GameResult {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameNo;
    @Column
    private Date gameDate;
//    @Column
//    private String gameRound;
//    @Column
//    private String seasonCode;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "game_round"),
            @JoinColumn(name = "season_code")
    })
    private Season season;

    @Column
    private String homeCode;
    @Column
    private int home1Spoint;
    @Column
    private int home2Spoint;
    @Column
    private int home3Spoint;
    @Column
    private int home4Spoint;
    @Column
    private int home5Spoint;
    @Column
    private String awayCode;
    @Column
    private int away1Spoint;
    @Column
    private int away2Spoint;
    @Column
    private int away3Spoint;
    @Column
    private int away4Spoint;
    @Column
    private int away5Spoint;

}
