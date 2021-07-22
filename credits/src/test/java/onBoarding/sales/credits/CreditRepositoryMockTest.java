package onBoarding.sales.credits;

import onBoarding.sales.credits.entity.Credit;
import onBoarding.sales.credits.repository.CreditRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class CreditRepositoryMockTest {

    @Autowired
    private CreditRepository creditRepository;

    @Test
    public void whenFindByCustomerName_thenReturnListCredit(){
        Credit credit01 = Credit.builder()
                .amount(28000000.0)
                .duration(24)
                .tax(2.1)
                .quota(100000.0)
                .customerName("Maria Paula Hernandez").build();
        creditRepository.save(credit01);

        List<Credit> founds = creditRepository.findByCustomerName(credit01.getCustomerName());

        Assertions.assertThat(founds.size()).isEqualTo(1);

    }

}
