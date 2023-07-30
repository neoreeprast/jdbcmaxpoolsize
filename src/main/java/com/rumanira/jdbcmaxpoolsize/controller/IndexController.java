package com.rumanira.jdbcmaxpoolsize.controller;

import com.rumanira.jdbcmaxpoolsize.entity.Product;
import com.rumanira.jdbcmaxpoolsize.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping
    List<Product> index() {
        return productRepository.findAll();

    }
}
