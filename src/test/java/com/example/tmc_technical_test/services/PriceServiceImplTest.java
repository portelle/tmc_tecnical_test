package com.example.tmc_technical_test.services;

import com.example.tmc_technical_test.entities.BrandEntity;
import com.example.tmc_technical_test.entities.PriceEntity;
import com.example.tmc_technical_test.models.PriceDTO;
import com.example.tmc_technical_test.repository.PriceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class PriceServiceImplTest {

    @InjectMocks
    PriceServiceImpl priceService;

    @Mock
    PriceRepository priceRepository;

    @BeforeEach
    void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test1() throws Exception{
        PriceEntity priceEntity = new PriceEntity();
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setId(1);
        brandEntity.setBrandName("Zara");

        priceEntity.setProductId(35344);
        priceEntity.setBrandEntity(brandEntity);
        priceEntity.setPriceList(1);
        priceEntity.setPriority(0);
        priceEntity.setPrice(BigDecimal.valueOf(10.11));
        priceEntity.setStartDate("2020-06-14-15.00.00");
        priceEntity.setEndDate("2020-06-14-18.30.00");

        when(priceRepository.findByStartDateBeforeAndEndDateAfter(anyString(), anyString()))
                .thenReturn(List.of(priceEntity));

        PriceDTO priceDTO =
                priceService.getPrice(1, 1, "2020-06-14-15.00.00");

        assertNotNull(priceDTO);
        assertEquals(35344, priceDTO.getProductId());

    }



}