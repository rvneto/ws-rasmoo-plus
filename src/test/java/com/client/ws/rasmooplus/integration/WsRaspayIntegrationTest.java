package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WsRaspayIntegrationTest {

    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "47779827003", "teste@teste.com", "Roberto", "Vargas");
        wsRaspayIntegration.createCustomer(dto);
    }

}
