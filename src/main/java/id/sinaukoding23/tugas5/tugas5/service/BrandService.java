package id.sinaukoding23.tugas5.tugas5.service;

import id.sinaukoding23.tugas5.tugas5.model.Brand;
import id.sinaukoding23.tugas5.tugas5.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository repository;

    @Transactional(readOnly = true)
    public List<Brand> findAll(){
        return repository.findAll();
    }
}