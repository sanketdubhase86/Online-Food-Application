package com.foodapp.foodapp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.foodapp.foodapp.DaoLayer.CartRepository;
import com.foodapp.foodapp.entity.Cart;

@SpringBootApplication
public class FoodappApplication {

	public static void main(String[] args) {
		
	 ConfigurableApplicationContext context=SpringApplication.run(FoodappApplication.class, args);
	 CartRepository userRepo=context.getBean(CartRepository.class);
	 Cart cart=new Cart();
	 cart.setNumberOfItems(2);
	 cart.setItem("Pizza");
	 cart.setPrice(129);
	 cart.setTotal_Price(259);
	 Cart cart1=userRepo.save(cart);
	 System.out.println(cart1);
	 
	}

}
