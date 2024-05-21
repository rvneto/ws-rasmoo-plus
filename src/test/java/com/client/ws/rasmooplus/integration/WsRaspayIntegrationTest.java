package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class WsRaspayIntegrationTest {

    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "47779827003", "teste@teste.com", "João", "Silva");
        wsRaspayIntegration.createCustomer(dto);
    }

    @Test
    void createOrderWhenDtoOK() {
        OrderDto dto = new OrderDto(null, "664be7c8c5c6aa57a0cf74b6", BigDecimal.ZERO, "MONTH22");
        wsRaspayIntegration.createOrder(dto);
    }

    @Test
    void processPaymentWhenDtoOK() {
        CreditCardDto creditCardDto = new CreditCardDto(456L, "47779827003", 0L, 6L, "4582365411287745", 2025L);
        PaymentDto paymentDto = new PaymentDto(creditCardDto, "664be7c8c5c6aa57a0cf74b6", "664d225cc91e334af84c8371");
        wsRaspayIntegration.processPayment(paymentDto);
    }

}
