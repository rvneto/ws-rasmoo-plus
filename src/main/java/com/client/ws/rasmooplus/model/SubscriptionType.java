package com.client.ws.rasmooplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;

    private String name;

    @Column(name = "acess_month")
    private Long acessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;

}
