package com.crofle.livecrowdfunding.repository;

import com.crofle.livecrowdfunding.domain.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    @Query("SELECT DISTINCT s FROM Schedule s " +
            "LEFT JOIN FETCH s.script " +
            "LEFT JOIN FETCH s.video " +
            "WHERE s.date >= :startDate AND s.date <= :endDate")
    List<Schedule> findByDateBetween(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
