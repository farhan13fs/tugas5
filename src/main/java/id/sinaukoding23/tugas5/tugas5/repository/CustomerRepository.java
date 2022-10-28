package id.sinaukoding23.tugas5.tugas5.repository;

import id.sinaukoding23.tugas5.tugas5.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
