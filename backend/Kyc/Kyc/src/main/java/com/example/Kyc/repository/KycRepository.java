package com.example.Kyc.repository;

import com.example.Kyc.entity.Kyc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KycRepository extends JpaRepository<Kyc,Long> {
    Kyc findByClientId(Long clientId);
}
