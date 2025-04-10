package com.nowij.nowLeague.api.gameResult.model;

import com.nowij.nowLeague.api.common.model.SeasonEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Table(name = "game_result")
@NoArgsConstructor
@Getter
@Setter
public class GameResultEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameNo;
    @Column
    private Date gameDate;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "game_round"),
            @JoinColumn(name = "season_code")
    })
    private SeasonEntity seasonEntity;

    @Column(name = "home_code")
    private String homeCode;
    @Column(name = "home_1_spoint")
    private int home1Spoint;
    @Column(name = "home_2_spoint")
    private int home2Spoint;
    @Column(name = "home_3_spoint")
    private int home3Spoint;
    @Column(name = "home_4_spoint")
    private int home4Spoint;
    @Column(name = "home_5_spoint")
    private int home5Spoint;
    @Column(name = "away_code")
    private String awayCode;
    @Column(name = "away_1_spoint")
    private int away1Spoint;
    @Column(name = "away_2_spoint")
    private int away2Spoint;
    @Column(name = "away_3_spoint")
    private int away3Spoint;
    @Column(name = "away_4_spoint")
    private int away4Spoint;
    @Column(name = "away_5_spoint")
    private int away5Spoint;

}
