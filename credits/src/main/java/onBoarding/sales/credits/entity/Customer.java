package onBoarding.sales.credits.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer")
@Getter
@Setter
@Data
public class Customer {

    @Id
    private Long idCustomer;
    private String nombre;

}
