package com.santosh.inventory.repository;

import java.awt.Color;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santosh.inventory.model.oracle.Login;

@Repository
public interface LoginRepository  extends CrudRepository<Login, String>{

}
