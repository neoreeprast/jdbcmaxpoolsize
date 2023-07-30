package com.rumanira.jdbcmaxpoolsize.repository;

import com.rumanira.jdbcmaxpoolsize.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
