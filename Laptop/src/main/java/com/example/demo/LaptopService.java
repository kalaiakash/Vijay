package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LaptopService {
	@Autowired
	LaptopDao bd;
	public String addInfo(LaptopEntity be) {
		return bd.addInfo(be);
	}
	public String updateInfo(LaptopEntity be) {
		return bd.updateInfo(be);
	}
	public String deleteInfo(Integer id) {
		return bd.deleteInfo(id);
	}
	public List<LaptopEntity>getInformation() {
		return bd.getInformation();
	}
	public String deleteInfo() {
		return bd.deleteInfo();
	}
	public String devilInfo(@RequestBody List<LaptopEntity> be) {
		return bd.devilInfo(be);
	}
	public List<LaptopEntity>getbrand(String laptopbrand) {
		return bd.getbrand(laptopbrand);
	}
	public List<LaptopEntity>getprice(int laptopprice1,int laptopprice2) {
		return bd.getprice(laptopprice1,laptopprice2);
	}

}
