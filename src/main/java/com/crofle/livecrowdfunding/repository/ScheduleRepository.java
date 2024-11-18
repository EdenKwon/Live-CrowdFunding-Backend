package com.crofle.livecrowdfunding.repository;

import com.crofle.livecrowdfunding.domain.entity.Schedule;
import com.crofle.livecrowdfunding.dto.response.YesterdayStreamingResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>  {
    @Query("""
            SELECT new com.crofle.livecrowdfunding.dto.response.YesterdayStreamingResponseDTO(
                p.productName,
                s.total_viewer,
                COUNT(DISTINCT ph.orderId)
            )
            FROM Schedule s
            LEFT JOIN s.project p
            LEFT JOIN p.orders o
            LEFT JOIN PaymentHistory ph ON o.id = ph.orderId
            WHERE DATE(s.date) = DATE(:yesterday)
            GROUP BY p.productName, s.total_viewer
            ORDER BY COUNT(DISTINCT ph.orderId) DESC
            """)
    List<YesterdayStreamingResponseDTO> findYesterdaySStats(@Param("yesterday") LocalDateTime yesterday);
}
