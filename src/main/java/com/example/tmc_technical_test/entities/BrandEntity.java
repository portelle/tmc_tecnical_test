package com.example.tmc_technical_test.entities;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "brands")
public class BrandEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private String brandName = null;

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
