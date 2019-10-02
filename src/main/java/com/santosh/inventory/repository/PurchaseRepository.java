package com.santosh.inventory.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santosh.inventory.model.oracle.Purchase;

@Repository
public interface PurchaseRepository  extends CrudRepository<Purchase, Integer>{

}
