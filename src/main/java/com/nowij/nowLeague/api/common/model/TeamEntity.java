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
    private String code;
    @Column(name = "team_name")
    private String name;
    @Column(name = "use_yn")
    private String useYn;
}
