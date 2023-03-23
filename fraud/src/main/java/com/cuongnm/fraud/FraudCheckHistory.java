package com.cuongnm.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name="fraud_id_sequence", sequenceName = "fraud_id_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_sequence")
    private Integer id;

    private Integer customerId;

    private Boolean isFraudter;
    private LocalDateTime createdAt;
}
