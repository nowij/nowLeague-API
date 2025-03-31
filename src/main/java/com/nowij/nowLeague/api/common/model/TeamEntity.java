package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "team")
@Setter
@Getter
public class TeamEntity {
    @Id
    @Column(name = "team_code")
    private String teamCode;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "use_yn")
    private String useYn;
}
