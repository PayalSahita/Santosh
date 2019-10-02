package com.santosh.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santosh.inventory.model.oracle.Size;

@Repository
public interface SizeRepository extends CrudRepository<Size, Integer>{

}
