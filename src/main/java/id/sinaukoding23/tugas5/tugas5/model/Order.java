package id.sinaukoding23.tugas5.tugas5.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Column
    private Integer orderStatus;

    @Column
    private Date orderDate;

    @Column
    private Date requiredDate;

    @Column
    private Date ShippedDate;
}
