package com.example.zaraapi.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zaraapi.entity.Price;

/**
 * PriceRepository
 * 
 * This interface is used to interact with the database to fetch the price data.
 */


@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            int productId, int brandId, LocalDateTime startDate, LocalDateTime endDate);
}