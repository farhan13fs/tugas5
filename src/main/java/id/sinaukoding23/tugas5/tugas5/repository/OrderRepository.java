package id.sinaukoding23.tugas5.tugas5.repository;

import id.sinaukoding23.tugas5.tugas5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
