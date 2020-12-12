package com.foodapp.foodapp.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.foodapp.entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

}
