package com.example.Kyc.VO;

import com.example.Kyc.entity.Kyc;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ResponseTemplateVO {
    private Kyc kyc;
    private LifeInsurance lifeInsurance;
}
