package com.simplilearn.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.Entity.Product;

@Repository
public interface Product_repo extends JpaRepository<Product, Long> {

}
