package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LaptopRepo extends JpaRepository<LaptopEntity, Integer>{

@Query(value="select * from info where laptopbrand like :laptopbrand ",nativeQuery = true)
	public List<LaptopEntity>getbrand(String laptopbrand);

@Query(value="select * from info where laptopprice<? and laptopprice>?",nativeQuery = true)
    public List<LaptopEntity>getprice(int laptopprice1,int laptopprice2);

}
