package com.example.tmc_technical_test.controllers;

import com.example.tmc_technical_test.dto.ApiPriceDTO;
import com.example.tmc_technical_test.entities.BrandEntity;
import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.services.PriceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apiguardian.api.API;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;


@WebMvcTest
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceServiceImpl priceService;

    @Autowired
    private ObjectMapper objectMapper;

/*    @Test
    void test1_sucess() throws Exception{

        BrandEntity brand = new BrandEntity();
        brand.setBrandName("Zara");
        brand.setId(1);

        PriceEntity price = new PriceEntity();
        price.setBrand(brand);
        price.setProductId(35455);
        price.setBrandId(1);
        price.setPriceList(1);
        price.setStartDate("2020-01-01-01.01.01");
        price.setEndDate("2020-01-01-01.01.01");
        price.setPrice(BigDecimal.valueOf(35.50));
        price.setPriority(0);
        price.setCurrency("EUR");

        ResponseEntity<PriceDTO> pricedto = ResponseEntity.status(HttpStatus.OK).body(ApiPriceDTO.mapEntityToDTO(price));

        Mockito.when(priceService.getPrice(1,1,"yoquese")).thenReturn(pricedto);

    mockMvc.perform(
            MockMvcRequestBuilders.get("/price")
                    .param("productId", String.valueOf(1))
                    .param("brandId", String.valueOf(1))
                    .param("date", "2022-11-01T10:07:54+01:00")
    ).andExpect(MockMvcResultMatchers.status().isOk());
    }*/


}