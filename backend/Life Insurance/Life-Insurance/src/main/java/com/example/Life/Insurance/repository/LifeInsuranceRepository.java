package com.example.Life.Insurance.repository;

import com.example.Life.Insurance.model.LifeInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LifeInsuranceRepository extends JpaRepository<LifeInsurance,Long> {
    LifeInsurance findByClientId(Long clientId);
}
