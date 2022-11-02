package com.example.tmc_technical_test.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

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