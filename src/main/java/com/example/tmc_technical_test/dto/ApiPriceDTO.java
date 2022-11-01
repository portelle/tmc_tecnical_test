package com.example.tmc_technical_test.dto;

import com.example.tmc_technical_test.models.Price;
import com.example.tmc_technical_test.models.PriceDTO;

public class ApiPriceDTO extends PriceDTO {
    public static ApiPriceDTO mapEntityToDTO(Price price) {
        ApiPriceDTO apiPriceDTO = new ApiPriceDTO();
        apiPriceDTO.setProductId(price.getProductId());
        apiPriceDTO.setBrandId(price.getBrandId());
        apiPriceDTO.setPriceList(price.getPriceList());
        apiPriceDTO.setPrice(price.getPrice());
        apiPriceDTO.setCurrency(price.getCurrency());
        apiPriceDTO.setStartDate(price.getStartDate());
        apiPriceDTO.setEndDate(price.getEndDate());
        return apiPriceDTO;
    }
}
