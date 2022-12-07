package com.example.Kyc.controller;

import com.example.Kyc.VO.ResponseTemplateVO;
import com.example.Kyc.entity.Kyc;
import com.example.Kyc.service.KycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kyc")
@CrossOrigin(origins="*")
public class KycController {
    @Autowired
    private KycService kycService;

    @PostMapping("/")
    public Kyc saveResult(@RequestBody Kyc kyc) {
        return kycService.saveKyc(kyc);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getLifeInsuranceWithId(@PathVariable("id") Long clientId){
        return kycService.getLifeInsuranceWithId(clientId);
    }
    @PutMapping("/{id}")
    public Kyc updateKycById(@PathVariable("id") Long clientId, @RequestBody Kyc kyc){
        Optional<Kyc>  kycData=  Optional.ofNullable(kycService.updateKycById(clientId));
        if(kycData.isPresent()){
            Kyc _kyc = kycData.get();
            _kyc.setPan(kyc.getPan());
            _kyc.setName(kyc.getName());
            _kyc.setClientId(kyc.getClientId());
            _kyc.setAddress(kyc.getAddress());
            _kyc.setAge(kyc.getAge());
            _kyc.setGender(kyc.getGender());
            _kyc.setMobNo(kyc.getMobNo());
            _kyc.setEmail(kyc.getEmail());
            _kyc.setCity(kyc.getCity());
            _kyc.setState(kyc.getState());
            _kyc.setCountry(kyc.getCountry());
            _kyc.setNationality(kyc.getNationality());
            return kycService.saveKyc(_kyc);
        }
        return kycService(HttpStatus.NOT_FOUND);
    }

    private Kyc kycService(HttpStatus notFound) {
        return kycService(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public void deleteKycById(@PathVariable("id") Long clientId){
        kycService.deleteKycById(clientId);
    }
    @GetMapping("/")
    public List<Kyc> getAllKycs(){
        List<Kyc> kycs = new ArrayList<>();
        return kycService.getAllKycs();
    }
    @GetMapping("/kyc/{id}")
    public Kyc findKycById(@PathVariable("id") Long clientId){
        return kycService.findKycById(clientId);
    }
}
