package com.example.tmc_technical_test.controllers;

import com.example.tmc_technical_test.api.PriceApi;
import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PriceController implements PriceApi {

    @Autowired
    private PriceService priceService;


    @Override
    public ResponseEntity<PriceDTO> getPrice(Integer productId, Integer brandId, String date) {
        return ResponseEntity.status(HttpStatus.OK).body(
                priceService.getPrice(productId, brandId, date)
        );
    }

}
