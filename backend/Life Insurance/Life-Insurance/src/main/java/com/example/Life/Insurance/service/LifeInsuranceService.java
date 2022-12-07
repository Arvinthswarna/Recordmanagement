package com.example.Life.Insurance.service;

import com.example.Life.Insurance.model.LifeInsurance;
import com.example.Life.Insurance.repository.LifeInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeInsuranceService {
    @Autowired
    private LifeInsuranceRepository lifeInsuranceRepository;


    public LifeInsurance saveLifeInsurance(LifeInsurance lifeInsurance) {
        return lifeInsuranceRepository.save(lifeInsurance);
    }

    public LifeInsurance findLifeInsuranceById(Long clientId) {
        return lifeInsuranceRepository.findByClientId(clientId);
    }

    public void deleteLifeInsuranceById(Long clientId) {
        lifeInsuranceRepository.deleteById(clientId);
    }

    public List<LifeInsurance> getAllLifeInsurances() {
        return lifeInsuranceRepository.findAll();
    }
}
