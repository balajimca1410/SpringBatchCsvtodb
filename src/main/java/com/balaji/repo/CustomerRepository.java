package com.balaji.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balaji.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
