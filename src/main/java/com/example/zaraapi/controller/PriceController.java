package com.example.zaraapi.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zaraapi.entity.Price;
import com.example.zaraapi.service.PriceService;

/*
 * PriceController
 * 
 *  This class is used to interact with the database to fetch the price data.
 * It is a REST controller that listens to the /price endpoint.
 *  
 *                  
 */
@RestController
public class PriceController {
    @Autowired
    private PriceService priceService;
    /*
     * 
     * @param productId
     * @param brandId
     * @param applicationDate
     * @return ResponseEntity<Price>
     */
    @GetMapping("/price")
    public ResponseEntity<Price> getPrice(
            @RequestParam int productId,
            @RequestParam int brandId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate) {
        Optional<Price> price = priceService.getApplicablePrice(productId, brandId, applicationDate);
        return price.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}