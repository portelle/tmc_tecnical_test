package com.example.tmc_technical_test.controllers;

import com.example.tmc_technical_test.api.PriceApi;

import com.example.tmc_technical_test.dto.ApiPriceDTO;

import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.services.PriceService;
import com.example.tmc_technical_test.services.PriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;


@RestController
public class PriceController implements PriceApi {

    @Autowired
    private PriceService priceService;


    @Override
    public ResponseEntity<PriceDTO> getPrice(Integer productId, Integer brandId, String date) {
        return priceService.getPrice(productId, brandId, OffsetDateTime.of(LocalDate.parse(date, DateTimeFormatter.ISO_DATE), LocalTime.MIN, ZoneOffset.UTC));
    }

}
