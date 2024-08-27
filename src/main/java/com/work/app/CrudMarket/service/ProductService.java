package com.work.app.CrudMarket.service;

import com.work.app.CrudMarket.model.Product;
import com.work.app.CrudMarket.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        try {
            return productRepository.save(product);
        } catch (Exception e) {
            // Log the exception
            System.err.println("Error saving product: " + e.getMessage());
            throw new RuntimeException("Error saving product: " + e.getMessage());
        }
    }

    public void deleteProduct(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            // Log the exception
            System.err.println("Error deleting product: " + e.getMessage());
            throw new RuntimeException("Error deleting product: " + e.getMessage());
        }
    }
}
