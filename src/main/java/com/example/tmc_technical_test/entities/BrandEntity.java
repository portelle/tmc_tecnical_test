package com.example.tmc_technical_test.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "brands")
public class BrandEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private String brandName = null;

/*

    public PriceEntity getPriceEntity() {
        return priceEntity;
    }

    public void setPriceEntity(PriceEntity priceEntity) {
        this.priceEntity = priceEntity;
    }

    @OneToOne(mappedBy = "brands", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PriceEntity priceEntity;
*/

    public Integer getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


}
