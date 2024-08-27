package com.work.app.CrudMarket.repository;

import com.work.app.CrudMarket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
