package com.example.zaraapi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int priceList;
    private int productId;
    private int priority;
    private double price;
    private String curr;

    /**
     * @return Long
     */
    /*
     * 
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    /*
     * 
     * @param id the id to set
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return int
     */
    public int getBrandId() {
        return brandId;
    }

    /*
     * 
     * @param brandId the brandId to set
     */

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    /*
     * 
     * @return LocalDateTime return the startDate
     */

    public LocalDateTime getStartDate() {
        return startDate;
    }

    /*
     * 
     * @param startDate the startDate to set
     */

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;

    }

    /*
     * 
     * @return LocalDateTime return the endDate
     */
    public LocalDateTime getEndDate() {

        return endDate;
    }

    /*
     * 
     * @param endDate the endDate to set
     */

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /*
     * 
     * @return int return the priceList
     */

    public int getPriceList() {
        return priceList;
    }

    /*
     * 
     * @param priceList the priceList to set
     */

    public void setPriceList(int priceList) {
        this.priceList = priceList;
    }

    /*
     * 
     * @return int return the productId
     */

    public int getProductId() {
        return productId;
    }

    /*
     * 
     * @param productId the productId to set
     */

    public void setProductId(int productId) {
        this.productId = productId;
    }

    /*
     * 
     * @return int return the priority
     */

    public int getPriority() {
        return priority;
    }

    /*
     * 
     * @param priority the priority to set
     */

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /*
     * 
     * @return double return the price
     */

    public double getPrice() {

        return price;
    }

    /*
     * 
     * @param price the price to set
     */

    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * 
     * @return String return the curr
     */

    public String getCurr() {
        return curr;
    }

}