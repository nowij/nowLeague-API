package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamEntity, String> {
    List<TeamEntity> findAll();
}
