package stmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Auto_table")
@Data
public class Auto {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
