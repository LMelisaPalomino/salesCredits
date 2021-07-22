package onBoarding.sales.credits.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_credit")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Data
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private int duration;

    private Double tax;

    private Double quota;

    @Column(name="customer_Name")
    private String customerName;

    private String status;
}
