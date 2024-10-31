package com.bkalika.gql.hplus.controller;

import com.bkalika.gql.hplus.data.Product;
import com.bkalika.gql.hplus.data.ProductRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    public Iterable<Product> products() {
        return this.productRepository.findAll();
    }

    @QueryMapping
    public Product productById(@Argument(name = "id") String id) {
        return this.productRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Iterable<Product> productByName(@Argument(name = "name") String name) {
        return this.productRepository.findByName(name);
    }

    @MutationMapping
    public Product addProduct(@Argument(name = "input") ProductInput productInput) {
        return this.productRepository.save(productInput.getProductEntity());
    }
}
