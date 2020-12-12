package com.foodapp.foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.foodapp.DaoLayer.CartRepository;

@RestController
public class Controller {
	private CartRepository crt;
	@Autowired
	public void setCrt(CartRepository crt) {
		System.out.println("Hey wiring has happend");
		this.crt = crt;
	}

}
