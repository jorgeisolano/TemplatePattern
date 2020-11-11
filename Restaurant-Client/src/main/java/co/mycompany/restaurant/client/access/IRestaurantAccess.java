/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mycompany.restaurant.client.access;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan
 */
public interface IRestaurantAccess {
    public String addDish(Dish dish)throws Exception;
}
