package com.diamorph.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "accountNumber can not be a null or empty")
    @Pattern(regexp = "$|[0-9]{10}", message = "accountNumber must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "accountType can not be a null or empty")
    private String accountType;
    @NotEmpty(message = "branchAddress can not be a null or empty")
    private String branchAddress;

}
