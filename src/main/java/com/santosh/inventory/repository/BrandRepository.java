package com.santosh.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santosh.inventory.model.oracle.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

}
