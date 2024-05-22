package com.client.ws.rasmooplus.mapper.wsraspay;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.model.User;

public class CustomerMapper {

    public static CustomerDto build(User user) {

        var fullname = user.getName().split(" ");
        var firstName = fullname[0];
        var lastName = fullname.length > 1 ? fullname[fullname.length - 1] : "";

        return CustomerDto.builder()
                .email(user.getEmail())
                .firstName(firstName)
                .lastName(lastName)
                .cpf(user.getCpf())
                .build();

    }

}
