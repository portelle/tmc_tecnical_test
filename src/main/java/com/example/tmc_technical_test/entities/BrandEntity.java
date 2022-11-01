package com.example.tmc_technical_test.entities;

import com.example.tmc_technical_test.models.Brand;
import com.example.tmc_technical_test.models.Price;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends Brand {
    @Id
    @Access(AccessType.PROPERTY)
    public Integer getId() {
        return super.getId();
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "brand_name", nullable = false)
    public String getBrandName() {
        return super.getBrandName();
    }

    @OneToMany(mappedBy = "brands", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PriceEntity price;

}
