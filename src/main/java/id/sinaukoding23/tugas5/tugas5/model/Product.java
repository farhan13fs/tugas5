package id.sinaukoding23.tugas5.tugas5.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Column
    private String productName;

    @Column
    private Integer modelYear;

    @Column
    private Integer listPrice;
}
