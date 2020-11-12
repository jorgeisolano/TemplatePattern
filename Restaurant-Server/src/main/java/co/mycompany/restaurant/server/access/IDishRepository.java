package co.mycompany.restaurant.server.access;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 * Interface del respositorio de Dish
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public interface IDishRepository {
    /**
     * Crear un Dish
     * @param dish a crear
     * @return  nombre del Dish creado
     */
    public String createDish(Dish dish);

}
