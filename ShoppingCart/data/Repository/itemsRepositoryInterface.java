package data.Repository;

import data.models.items;

public interface itemsRepositoryInterface {
    items add(String Name);
    void removeItems(String Name);
    boolean EditItems(String Name);
}