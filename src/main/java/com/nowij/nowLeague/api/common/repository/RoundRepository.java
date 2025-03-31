package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.RoundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoundRepository extends JpaRepository<RoundEntity, String> {
    List<RoundEntity> findAll();
}
