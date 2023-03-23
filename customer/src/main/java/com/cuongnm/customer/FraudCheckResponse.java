package com.cuongnm.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FraudCheckResponse {
    @JsonProperty
    private boolean isFraudter;
}
