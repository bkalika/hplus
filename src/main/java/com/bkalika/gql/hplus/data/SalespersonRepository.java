package com.bkalika.gql.hplus.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {

    Salesperson findByEmail(String email);
}