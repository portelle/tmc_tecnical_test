package com.example.tmc_technical_test.repository;

import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {

}
