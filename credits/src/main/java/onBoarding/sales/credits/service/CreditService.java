package onBoarding.sales.credits.service;

import onBoarding.sales.credits.entity.Credit;

import java.util.List;

public interface CreditService {
    public List<Credit> listAllCredits();

    public Credit getCredit(Long id);

    public Credit createCredit(Credit credit);

    public Credit updateCredit(Credit credit);

    public Credit deleteCredit(Long id);

    public List<Credit> findByCustomerName(String name);


}
