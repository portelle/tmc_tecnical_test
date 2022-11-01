package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.entities.PriceEntity;

import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.repository.PriceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;

    @Override
    public ResponseEntity<PriceDTO> getPrice(Integer productId, Integer brandId, OffsetDateTime date) {
        List<PriceEntity> priceEntitiesList = priceRepository.findAll();
        PriceDTO priceDTO = new PriceDTO();
        priceDTO.setProductId(priceEntitiesList.get(0).getProductId());
        priceDTO.setPrice(priceEntitiesList.get(0).getPrice());
        priceDTO.setPriceList(priceEntitiesList.get(0).getPriceList());
        priceDTO.setCurrency(priceEntitiesList.get(0).getCurrency());
        priceDTO.setBrandId(priceEntitiesList.get(0).getBrandEntity().getId());
        priceDTO.setStartDate(priceEntitiesList.get(0).getStartDate());
        priceDTO.setEndDate(priceEntitiesList.get(0).getEndDate());

        return ResponseEntity.status(HttpStatus.OK).body(priceDTO);
    }
}
