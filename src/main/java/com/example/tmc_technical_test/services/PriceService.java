package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.models.PriceDTO;


public interface PriceService {

    PriceDTO getPrice(Integer productId, Integer brandId, String date);

}
