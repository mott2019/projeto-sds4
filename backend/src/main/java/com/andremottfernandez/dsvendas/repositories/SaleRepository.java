package com.andremottfernandez.dsvendas.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.andremottfernandez.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepositoryImplementation<Sale, Long> {

}
