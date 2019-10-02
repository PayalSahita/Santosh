package com.santosh.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santosh.inventory.model.oracle.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
