package com.example.tmc_technical_test.entities;


import lombok.NoArgsConstructor;
import java.lang.String;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Table(name= "prices")
public class PriceEntity {
    @Column(name = "start_date")
    private String startDate = null;

    @Column(name = "end_date")
    private String endDate = null;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer priceList = null;

    @Column(name = "product_id")
    private Integer productId = null;

    @Column(name = "priority")
    private Integer priority = null;

    @Column(name = "price")
    private BigDecimal price = null;

    @Column(name = "currency")
    private String currency = null;

    public BrandEntity getBrandEntity() {
        return brandEntity;
    }

    public void setBrandEntity(BrandEntity brandEntity) {
        this.brandEntity = brandEntity;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private BrandEntity brandEntity;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
