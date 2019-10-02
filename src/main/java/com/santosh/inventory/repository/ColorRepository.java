package com.santosh.inventory.repository;

import java.awt.Color;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ColorRepository extends CrudRepository<Color, Integer>{

}
