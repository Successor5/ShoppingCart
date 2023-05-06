package data.Repository;

import java.util.List;

import data.models.items;

public interface CartRepositoryInterface {
 List<items> additems(items item, int quantity);
    boolean updateitem(items item, int newQuantity);
    void removeitem(items item);
    List<items> getCartItems();
    double getTotalPrice();
    void clearCart();
}

