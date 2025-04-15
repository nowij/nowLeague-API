package com.nowij.nowLeague.api.common.repository;

import com.nowij.nowLeague.api.common.model.SeasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonRepository extends JpaRepository<SeasonEntity, String> {
    @Query(value = "SELECT SEASON_CODE as seasonCode, SEASON_NAME as seasonName FROM season GROUP BY SEASON_CODE, SEASON_NAME ORDER BY SEASON_CODE DESC", nativeQuery = true)
    List<Object[]> selectAllSeasons();

    @Query(value = "SELECT DISTINCT(SEASON_CODE) FROM season WHERE DATE_FORMAT(END_DATE, '%Y%m') >= :month AND DATE_FORMAT(START_DATE, '%Y%m') <= :month", nativeQuery = true)
    String selectTodaySeason(String month);
}
