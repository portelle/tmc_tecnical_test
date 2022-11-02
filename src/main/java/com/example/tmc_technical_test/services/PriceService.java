package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.PriceDTO;
import org.springframework.http.ResponseEntity;
import org.threeten.bp.OffsetDateTime;


public interface PriceService {

    PriceDTO getPrice(Integer productId, Integer brandId, String date);

}
