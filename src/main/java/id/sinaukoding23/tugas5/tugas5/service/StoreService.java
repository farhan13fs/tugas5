package id.sinaukoding23.tugas5.tugas5.service;

import id.sinaukoding23.tugas5.tugas5.model.Store;
import id.sinaukoding23.tugas5.tugas5.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository repository;

    @Transactional(readOnly = true)
    public List<Store> findAll(){
        return repository.findAll();
    }
}
