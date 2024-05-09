package com.nowij.nowLeague.api.current.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "season")
public class Season {
    @Id
    @Column
    private String seasonCode;
    @Id
    @Column
    private String gameRound;
    @Column
    private String seasonName;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
}
