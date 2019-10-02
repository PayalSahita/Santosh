package com.santosh.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.santosh.inventory.model.oracle.Sale;

@Repository
public interface SaleRepository extends CrudRepository<Sale, Integer>{

}
