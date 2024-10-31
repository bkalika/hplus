package com.bkalika.gql.hplus.controller;

import com.bkalika.gql.hplus.data.Salesperson;
import com.bkalika.gql.hplus.data.SalespersonRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SalespersonController {
    private final SalespersonRepository salespersonRepository;

    public SalespersonController(SalespersonRepository salespersonRepository) {
        this.salespersonRepository = salespersonRepository;
    }

    @QueryMapping
    public Iterable<Salesperson> salespeople() {
        return salespersonRepository.findAll();
    }

    @QueryMapping
    public Salesperson salespersonById(@Argument(name = "id") Long id) {
        return this.salespersonRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Salesperson salespersonByEmail(@Argument(name = "email") String email) {
        return this.salespersonRepository.findByEmail(email);
    }
}
