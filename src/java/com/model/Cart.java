/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.HashMap;
import java.util.Set;

/**
 * Shopping cart that holds the items the user intends to buy.
 * @author Henrik
 */
public class Cart {
    
    private HashMap items;
    
    /**
     * Default constructor
     */
    public Cart() {}
    
    /**
     * Adds specfied amount of an item to the cart.
     * @param item
     * @param amount 
     */
    public void addItem(Items item, int amount) {
        items.put(item.getItemid(), amount);
    }
    
    /**
     * Removes all of specified item.
     * @param item 
     */
    public void removeItem(Items item) {
        items.remove(item);
    }
    
    /**
     * Removes specified amount of item from cart.
     * @param item
     * @param amount 
     */
    public void removeItem(Items item, int amount) {
        amount = amount - (int)items.get(item);
        items.replace(item, amount);
    }
    
    /**
     * Removes all items from cart.
     */
    public void removeAll(){
        items.clear();
    }
    
    /**
     * Returns a Set of the mappings in the Cart.
     * @return Set
     */
    public Set getCart() {
        return items.entrySet();
    }
    
}
