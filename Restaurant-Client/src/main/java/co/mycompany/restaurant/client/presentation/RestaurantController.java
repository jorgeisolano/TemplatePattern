/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mycompany.restaurant.client.presentation;

import co.mycompany.restaurant.client.access.IRestaurantAccess;
import co.mycompany.restaurant.client.access.RestauranteAccessImplSockets;
import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan
 */
public class RestaurantController {
    private static RestaurantController instance;
    IRestaurantAccess service = new RestauranteAccessImplSockets();
    
    public static RestaurantController getInstance() {
        if (instance == null) {
            instance = new RestaurantController();
        }
        return instance;
    }
    
    public String addDish(Dish dish)throws Exception{
        return service.addDish(dish);
    }
}
