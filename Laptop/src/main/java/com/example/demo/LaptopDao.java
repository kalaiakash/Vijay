package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class LaptopDao {
	@Autowired
	LaptopRepo br;
	public String addInfo(LaptopEntity be) {
		br.save(be);
		return "data added";
	}
	public String updateInfo(LaptopEntity be) {
		br.save(be).getId();
		return "data updated";
	}
	public String deleteInfo(Integer id) {
		br.deleteById(id);
		return "data deleted";
	}
	public List <LaptopEntity>getInformation() {
		return br.findAll();
	}
	public String deleteInfo() {
		br.deleteAll();
		return "data deleted";
	}
	public String devilInfo(List<LaptopEntity> be) {
		for(LaptopEntity i:be) {
			br.save(i);
		}
		return "saved in bulk";
	}
	public List<LaptopEntity>getbrand(String laptopbrand) {
		List <LaptopEntity>find=br.getbrand(laptopbrand);
		return find;
		
	}
	public List<LaptopEntity>getprice(int laptopprice1,int laptopprice2) {
		List<LaptopEntity>price=br.getprice(laptopprice1,laptopprice2);
		return price;
	}

}
