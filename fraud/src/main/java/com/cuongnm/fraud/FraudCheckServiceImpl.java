package com.cuongnm.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckServiceImpl implements FraudCheckService{

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    @Override
    public Boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder().customerId(customerId).isFraudter(false).createdAt(LocalDateTime.now()).build());
        return false;
    }
}
