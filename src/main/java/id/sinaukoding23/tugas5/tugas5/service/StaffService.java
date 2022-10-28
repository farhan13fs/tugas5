package id.sinaukoding23.tugas5.tugas5.service;

import id.sinaukoding23.tugas5.tugas5.model.Staff;
import id.sinaukoding23.tugas5.tugas5.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;

    @Transactional(readOnly = true)
    public List<Staff> findAll(){
        return repository.findAll();
    }
}
