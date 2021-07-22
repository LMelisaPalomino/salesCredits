package onBoarding.sales.credits.controller;

import onBoarding.sales.credits.entity.Credit;
import onBoarding.sales.credits.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/credits")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping
    public ResponseEntity<List<Credit>> listCredit(){
        List<Credit> credits = creditService.listAllCredits();
        if(credits.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(credits);
    }

}
