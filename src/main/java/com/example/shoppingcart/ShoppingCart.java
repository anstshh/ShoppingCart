package com.example.shoppingcart;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ShoppingCart {
    private final List<Integer> listIds;

    public ShoppingCart() {
        this.listIds = new ArrayList<>();
    }

    public List<Integer> getListIds(){
        return listIds;
    }
}
