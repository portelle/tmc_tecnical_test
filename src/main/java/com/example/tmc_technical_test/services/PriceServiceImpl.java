package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.dto.ApiPriceDTO;
import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.Price;
import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.repository.PriceRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;

    @Override
    public ResponseEntity<PriceDTO> getPrice(Integer productId, Integer brandId, OffsetDateTime date) {
        return ResponseEntity.status(HttpStatus.OK).body(ApiPriceDTO.mapEntityToDTO(priceRepository.findAll().get(0)));
    }
}
