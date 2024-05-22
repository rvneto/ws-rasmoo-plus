package com.client.ws.rasmooplus.mapper.wsraspay;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;

public class PaymentMapper {

    public static PaymentDto build(String orderId, String customerId, CreditCardDto dto) {
        return PaymentDto.builder()
                .orderId(orderId)
                .customerId(customerId)
                .creditCard(dto)
                .build();
    }

}
