package com.client.ws.rasmooplus.mapper.wsraspay;

import com.client.ws.rasmooplus.dto.UserPaymentInfoDto;
import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;

public class CreditCardMapper {

    public static CreditCardDto build(UserPaymentInfoDto dto, String documentNumber) {
        return CreditCardDto.builder()
                .documentNumber(documentNumber)
                .cvv(Long.parseLong(dto.getCardSecurityCode()))
                .month(dto.getCardExpirationMonth())
                .year(dto.getCardExpirationYear())
                .number(dto.getCardNumber())
                .installments(dto.getInstallments())
                .build();
    }

}
