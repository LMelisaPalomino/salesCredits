package onBoarding.sales.credits.repository;

import onBoarding.sales.credits.entity.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditRepository extends JpaRepository<Credit, Long> {

    public List<Credit> findByCustomerName(String name);
}
