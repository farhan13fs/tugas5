package id.sinaukoding23.tugas5.tugas5.service;

import id.sinaukoding23.tugas5.tugas5.model.Order;
import id.sinaukoding23.tugas5.tugas5.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<Order> findAll(){
        return repository.findAll();
    }
}
