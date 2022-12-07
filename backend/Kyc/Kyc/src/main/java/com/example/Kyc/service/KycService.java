package com.example.Kyc.service;

import com.example.Kyc.VO.LifeInsurance;
import com.example.Kyc.VO.ResponseTemplateVO;
import com.example.Kyc.entity.Kyc;
import com.example.Kyc.repository.KycRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class KycService {
    @Autowired
    private KycRepository kycRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Kyc saveKyc(Kyc kyc) {
        return kycRepository.save(kyc);
    }

    public ResponseTemplateVO getLifeInsuranceWithId(Long clientId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Kyc kyc = kycRepository.findByClientId(clientId);
        LifeInsurance lifeInsurance = restTemplate.getForObject("http://localhost:5006/lifeinsurance/"+kyc.getClientId(),LifeInsurance.class);
        vo.setKyc(kyc);
        vo.setLifeInsurance(lifeInsurance);
        return vo;
    }



    public void deleteKycById(Long clientId) {
        kycRepository.deleteById(clientId);
    }

    public List<Kyc> getAllKycs() {
        return kycRepository.findAll();
    }

    public Kyc findKycById(Long clientId) {
        return kycRepository.findByClientId(clientId);
    }


    public Kyc updateKycById(Long clientId) {
        return kycRepository.findByClientId(clientId);
    }
}
