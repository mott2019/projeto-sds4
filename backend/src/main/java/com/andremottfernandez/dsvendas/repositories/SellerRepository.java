package com.andremottfernandez.dsvendas.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.andremottfernandez.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepositoryImplementation<Seller, Long> {

}
