package id.sinaukoding23.tugas5.tugas5.controller;

import id.sinaukoding23.tugas5.tugas5.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("/find-all")
    public ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}