package com.nowij.nowLeague.api.current.repository;

import com.nowij.nowLeague.api.current.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankRepository extends JpaRepository<Team, String> {
}
