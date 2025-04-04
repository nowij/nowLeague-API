package com.nowij.nowLeague.api.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "round")
@Getter
@Setter
public class RoundEntity {
    @Id
    @Column
    private String code;
    @Column(name = "kor_name")
    private String name;
    @Column(name = "use_yn")
    private String useYn;
}
