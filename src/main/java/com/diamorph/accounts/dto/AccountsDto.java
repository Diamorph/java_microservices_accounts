package com.diamorph.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account"
)
public class AccountsDto {

    @NotEmpty(message = "accountNumber can not be a null or empty")
    @Pattern(regexp = "$|[0-9]{10}", message = "accountNumber must be 10 digits")
    @Schema(
            description = "Account number of Eazy Bank Account",
            example = "0123456789"
    )
    private Long accountNumber;
    @NotEmpty(message = "accountType can not be a null or empty")
    @Schema(
            description = "Account type of Eazy Bank Account",
            example = "Checking"
    )
    private String accountType;
    @NotEmpty(message = "branchAddress can not be a null or empty")
    @Schema(
            description = "Eazy Bank branch address",
            example = "123 New York"
    )
    private String branchAddress;

}
