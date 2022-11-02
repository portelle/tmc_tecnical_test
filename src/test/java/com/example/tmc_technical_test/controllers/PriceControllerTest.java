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
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void requestedTest1()throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .param("productId", String.valueOf(35455))
                                .param("brandId", String.valueOf(1))
                                .param("date", "2020-06-14-10.00.00")
                )
                .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(1));
    }
    @Test
    public void requestedTest2()throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .param("productId", String.valueOf(35455))
                                .param("brandId", String.valueOf(1))
                                .param("date", "2020-06-14-18.00.00")
                )
                .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(2));
    }
    @Test
    public void requestedTest3()throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .param("productId", String.valueOf(35455))
                                .param("brandId", String.valueOf(1))
                                .param("date", "2020-06-14-21.00.00")
                )
                .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(1));

    }
    @Test
    public void requestedTest4()throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .param("productId", String.valueOf(35455))
                                .param("brandId", String.valueOf(1))
                                .param("date", "2020-06-15-10.00.00")
                )
                .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(3));

    }
    @Test
    public void requestedTest5()throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .param("productId", String.valueOf(35455))
                                .param("brandId", String.valueOf(1))
                                .param("date", "2020-06-16-21.00.00")
                )
                .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(4));
    }
}