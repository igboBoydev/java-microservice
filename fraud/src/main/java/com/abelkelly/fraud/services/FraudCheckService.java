package com.abelkelly.fraud.services;

import com.abelkelly.fraud.Repository.FraudCheckHistoryRepository;
import com.abelkelly.fraud.models.FraudCheckHistory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer CustomerId){
        System.out.println("Hello world");
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder().CustomerId(CustomerId).isFraudster(false).createdAt(LocalDateTime.now()).build());
        return false;
    }
}
