package com.example.tmc_technical_test.controllers;

import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.repository.PriceRepository;
import com.example.tmc_technical_test.services.PriceService;
import com.example.tmc_technical_test.services.PriceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@WebMvcTest
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private PriceRepository priceRepository;

    @MockBean
    private PriceServiceImpl priceService;

    @InjectMocks
    private PriceController priceController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test1() throws Exception{
        when(priceService.getPrice(anyInt(), anyInt(), anyString()))
                .thenReturn(
                        new PriceDTO().
                                productId(1)
                                .brandId(1)
                                .priceList(2)
                                .price(BigDecimal.valueOf(1))
                                .currency("EUR")
                                .startDate("2020-06-14-18.30.00")
                                .endDate("2020-06-14-15.00.00")
                );

        mockMvc.perform(
                MockMvcRequestBuilders.get("/price")
                        .param("productId", String.valueOf(1))
                        .param("brandId", String.valueOf(1))
                        .param("date", "2020-06-14-18.30.00")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(1));
    }
}