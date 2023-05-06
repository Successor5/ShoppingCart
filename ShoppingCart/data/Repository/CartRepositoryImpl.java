package data.Repository;

import java.util.ArrayList;
import java.util.List;

import data.models.items;

public class CartRepositoryImpl implements CartRepositoryInterface {
    ArrayList <items> cart = new ArrayList<>();
    @Override
    public  ArrayList<items> additems(items item, int quantity) {
        items newitem = new items();
        cart.add(newitem);
        return cart;
    }

    @Override
    public boolean updateitem(items item, int newQuantity) {
    List<items> cartItems = getCartItems();
    for (items currentItem : cartItems) {
        if (currentItem.equals(item)) {
            currentItem.setQuantity(newQuantity);
            return true;
        }
    }
    return false;
        
    }

    @Override
    public void removeitem(items item) {
            if(item==this.getCartItems());
            item.remove(item);
    }

    @Override
    public List<items> getCartItems() {
        return cart;
    }
    @Override
public double getTotalPrice() {
    double total = price*;
    }
    return total;
} 

    

    @Override
    public void clearCart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearCart'");
    }

}