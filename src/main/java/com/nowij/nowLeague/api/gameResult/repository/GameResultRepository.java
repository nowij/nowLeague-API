package com.nowij.nowLeague.api.gameResult.repository;

import com.nowij.nowLeague.api.gameResult.model.GameResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameResultRepository extends JpaRepository<GameResultEntity, String> {
    Optional<GameResultEntity> findByGameNo(int gameNo);
}