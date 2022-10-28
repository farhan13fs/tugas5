package id.sinaukoding23.tugas5.tugas5.service;

import id.sinaukoding23.tugas5.tugas5.model.Product;
import id.sinaukoding23.tugas5.tugas5.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<Product> findAll(){
        return repository.findAll();
    }
}
