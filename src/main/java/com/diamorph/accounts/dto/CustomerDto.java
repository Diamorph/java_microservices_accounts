package com.diamorph.accounts.dto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {

    private String name;
    private String email;
    private String mobileNumber;
    private List<AccountsDto> accounts;
}
