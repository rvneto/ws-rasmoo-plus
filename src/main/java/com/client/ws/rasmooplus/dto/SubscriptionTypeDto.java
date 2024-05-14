package com.client.ws.rasmooplus.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionTypeDto {

    private Long id;

    @Size(min = 5, max = 30)
    @NotBlank(message = "não pode ser nulo ou vazio")
    private String name;

    @Max(value = 12, message = "não pode ser maior que 12")
    private Long accessMonths;

    @NotNull(message = "não pode ser nulo")
    private BigDecimal price;

    @Size(min = 5, max = 15, message = "deve ter tamanho entre 5 e 15")
    @NotBlank(message = "não pode ser nulo ou vazio")
    private String productKey;

}
