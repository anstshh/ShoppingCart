package com.example.shoppingcart;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    final ShoppingCart shoppingCart;


    public CartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(List<Integer> id){
        shoppingCart.getListIds().addAll(id);
    }

    public List<Integer> showIds(){
        return shoppingCart.getListIds();
    }
}
