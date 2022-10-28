package id.sinaukoding23.tugas5.tugas5.repository;

import id.sinaukoding23.tugas5.tugas5.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
