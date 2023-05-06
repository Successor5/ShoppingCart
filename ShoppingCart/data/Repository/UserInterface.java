package data.Repository;

import data.models.user;

public interface UserInterface {
    user Save(String name); 
    user delete(String id);
    
}
