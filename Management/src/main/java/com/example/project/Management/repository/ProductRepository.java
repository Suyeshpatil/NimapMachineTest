package com.example.project.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Management.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
