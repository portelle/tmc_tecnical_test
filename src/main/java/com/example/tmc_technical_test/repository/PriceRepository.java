package com.example.tmc_technical_test.repository;

import com.example.tmc_technical_test.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {
    List<PriceEntity> findByBrand_IdIsAndProductIdIsAndStartDateBeforeAndEndDateAfter(Integer brandId, Integer productId, String date, String dateCopy);
}
