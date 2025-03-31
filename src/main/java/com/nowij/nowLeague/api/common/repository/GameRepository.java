package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.GameResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<GameResultEntity, String> {
    Optional<GameResultEntity> findByGameNo(int gameNo);
}