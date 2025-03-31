package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<GameResult, String> {
    Optional<GameResult> findByGameNo(int gameNo);
}