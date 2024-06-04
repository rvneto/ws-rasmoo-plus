package com.client.ws.rasmooplus.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailIntegrationTest {

    @Autowired
    private MailIntegration mailIntegration;

    @Test
    void sendMailOK() {
        mailIntegration.send("rvneto.rs@gmail.com", "Olá Gmail", "Assunto");
    }

}
