package onBoarding.sales.credits.service;

import onBoarding.sales.credits.entity.Credit;
import onBoarding.sales.credits.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImp implements CreditService{
    @Autowired
    private CreditRepository creditRepository;

    @Override
    public List<Credit> listAllCredits() {
        return creditRepository.findAll();
    }

    @Override
    public Credit getCredit(Long id) {
        return creditRepository.findById(id).orElse(null);
    }

    @Override
    public Credit createCredit(Credit credit) {
        credit.setStatus("A");
        return creditRepository.save(credit);
    }

    @Override
    public Credit updateCredit(Credit credit) {
        Credit creditDB = getCredit(credit.getId());
        if(null == creditDB){
            return null;
        }
        creditDB.setAmount(credit.getAmount());
        creditDB.setDuration(credit.getDuration());
        creditDB.setQuota(credit.getQuota());
        creditDB.setTax(credit.getTax());
        creditDB.setCustomerName(credit.getCustomerName());
        return creditRepository.save(creditDB);
    }

    @Override
    public Credit deleteCredit(Long id) {
        Credit creditDB = getCredit(id);
        if(null == creditDB){
            return null;
        }
        creditDB.setStatus("I");
        return creditRepository.save(creditDB);
    }

    @Override
    public List<Credit> findByCustomerName(String name) {
        return creditRepository.findByCustomerName(name);
    }
}
