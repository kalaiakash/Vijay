package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Laptopcontroller {
	@Autowired
	LaptopService bs;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody LaptopEntity be) {
		return bs.addInfo(be);
	}
	@PutMapping(value="/update")
	public String updateInfo(@RequestBody LaptopEntity be) {
		return bs.updateInfo(be);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteInfo(@PathVariable Integer id) {
		return bs.deleteInfo(id);
	}
	@GetMapping(value="/getinfo")
	public List<LaptopEntity>getInformation(){
		return bs.getInformation();
	}
	@DeleteMapping(value="/deleteAll")
	public String deleteInfo() {
		return bs.deleteInfo();

	}
	@PostMapping(value="/devil")        //for bulk
	public String devilInfo(@RequestBody List<LaptopEntity> be) {
		return bs.devilInfo(be);
	}
	@GetMapping(value="/getbrand/{laptopbrand}")
	public List<LaptopEntity> getbrand(@PathVariable String laptopbrand){
		return bs.getbrand(laptopbrand);
	}
	@GetMapping(value="/getprice/{laptopprice1}/{laptopprice2}")
	public List<LaptopEntity>getprice(@PathVariable int laptopprice1,@PathVariable int laptopprice2) {
		return bs.getprice(laptopprice1,laptopprice2);
	}
	

}
