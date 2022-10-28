package id.sinaukoding23.tugas5.tugas5.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zipCode;
}
