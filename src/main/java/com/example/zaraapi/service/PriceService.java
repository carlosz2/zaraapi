package com.example.zaraapi.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zaraapi.entity.Price;
import com.example.zaraapi.repository.PriceRepository;

/*
 * PriceService
 * 
 *  This class is used to interact with the database to fetch the price data.
 */

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    public Optional<Price> getApplicablePrice(int productId, int brandId, LocalDateTime applicationDate) {
        List<Price> prices = priceRepository.findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                productId, brandId, applicationDate, applicationDate);
        return prices.stream().max(Comparator.comparingInt(Price::getPriority));
    }
}