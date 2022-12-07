package com.example.Life.Insurance.controller;

import com.example.Life.Insurance.model.LifeInsurance;
import com.example.Life.Insurance.service.LifeInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lifeinsurance")
@CrossOrigin(origins="*")
public class LifeInsuranceController {
    @Autowired
    private LifeInsuranceService lifeInsuranceService;

    @PostMapping("/")
    public LifeInsurance saveLifeInsurance(@RequestBody LifeInsurance lifeInsurance){
        return lifeInsuranceService.saveLifeInsurance(lifeInsurance);

    }
    @GetMapping("/{id}")
    public LifeInsurance findLifeInsuranceById(@PathVariable("id")Long clientId){
        return lifeInsuranceService.findLifeInsuranceById(clientId);
    }
    @PutMapping("/{id}")
    public LifeInsurance updateLifeInsuranceById(@PathVariable("id") Long clientId, @RequestBody LifeInsurance lifeInsurance){
        Optional<LifeInsurance> lifeInsuranceData = Optional.ofNullable(lifeInsuranceService.findLifeInsuranceById(clientId));
        if(lifeInsuranceData.isPresent()) {
            LifeInsurance _lifeInsurance = lifeInsuranceData.get();
            _lifeInsurance.setPolicyType(lifeInsurance.getPolicyType());
            _lifeInsurance.setPolicyNo(lifeInsurance.getPolicyNo());
            _lifeInsurance.setInsuredName(lifeInsurance.getInsuredName());
            _lifeInsurance.setAddress(lifeInsurance.getAddress());
            _lifeInsurance.setMobNo(lifeInsurance.getMobNo());
            _lifeInsurance.setEmail(lifeInsurance.getEmail());
            _lifeInsurance.setOccupation(lifeInsurance.getOccupation());
            _lifeInsurance.setEducation(lifeInsurance.getEducation());
            _lifeInsurance.setDesignation(lifeInsurance.getDesignation());
            _lifeInsurance.setMedicalStatus(lifeInsurance.getMedicalStatus());
            _lifeInsurance.setPremiumAmount(lifeInsurance.getPremiumAmount());
            _lifeInsurance.setAnnualIncome(lifeInsurance.getAnnualIncome());
            return lifeInsuranceService.saveLifeInsurance(_lifeInsurance);
        }
        return lifeInsuranceService(HttpStatus.NOT_FOUND);
    }

    private LifeInsurance lifeInsuranceService(HttpStatus notFound) {
        return lifeInsuranceService(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public void deleteLifeInsuranceById(@PathVariable("id") Long clientId){
        lifeInsuranceService.deleteLifeInsuranceById(clientId);
    }

    @GetMapping("/")
    public List<LifeInsurance> getAllLifeInsurances(){
        List<LifeInsurance> lifeInsurances = new ArrayList<LifeInsurance>();
        return lifeInsuranceService.getAllLifeInsurances();
    }
}
