package co.mycompany.restaurant.client.access;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public interface IRestaurantAccess {
    
    /**
     * Crea un Dish
     *
     * @param dish dish de restaurant
     * @return devuelve el nombre del plato creado
     * @throws Exception error crear el dish
     */
    public String addDish(Dish dish)throws Exception;
}
