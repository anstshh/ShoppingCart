package com.example.shoppingcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Controller {
    final CartService cartService;

    public Controller(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam List<Integer> ids){
        cartService.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> getProductIds(){
        return cartService.showIds();
    }
}
