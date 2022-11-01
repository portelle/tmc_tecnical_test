package com.example.tmc_technical_test.entities;

import com.example.tmc_technical_test.models.Price;
import org.springframework.data.jpa.repository.Temporal;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.SQLData;

@Entity
@Table(name= "prices")
public class PriceEntity extends Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer primary_Key;

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @Override
    public Integer getBrandId() {
        return brand.getId();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "start_date")
    public OffsetDateTime getStartDate() {
        return super.getStartDate();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "end_date")
    public OffsetDateTime getEndDate() {
        return super.getEndDate();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "price_list")
    public Integer getPriceList() {
        return super.getPriceList();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "product_id")
    public Integer getProductId() {
        return super.getProductId();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "priority")
    public Integer getPriority() {
        return super.getPriority();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "price")
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "currency")
    public String getCurrency() {
        return super.getCurrency();
    }
}
