package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.entities.PriceEntity;

import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.repository.PriceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;

    @Override
    public PriceDTO getPrice(Integer productId, Integer brandId, String date) {
        List<PriceEntity> priceEntitiesList = priceRepository.findByBrand_IdIsAndProductIdIsAndStartDateBeforeAndEndDateAfter(brandId, productId, date, date);
        PriceDTO priceDTO = new PriceDTO();

        int higestPrio = priceEntitiesList.stream()
                .map(PriceEntity::getPriority)
                .max(Integer::compareTo)
                .orElse(-1);

        List<PriceEntity> higestPrioPrices = priceEntitiesList.stream()
                .filter(priceEntity -> priceEntity.getPriority()==higestPrio)
                .collect(Collectors.toList());

        return priceDTO
                .productId(higestPrioPrices.get(0).getProductId())
                .brandId(higestPrioPrices.get(0).getBrand().getId())
                .priceList(higestPrioPrices.get(0).getPriceList())
                .price(higestPrioPrices.get(0).getPrice())
                .currency(higestPrioPrices.get(0).getCurrency())
                .startDate(higestPrioPrices.get(0).getStartDate())
                .endDate(higestPrioPrices.get(0).getEndDate());
    }
}
