package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column
    private String teamCode;
    @Column
    private String teamName;
    @Column
    private String useYn;
}
