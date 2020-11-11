package co.mycompany.restaurant.server.access;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 * Interface del respositorio de clientes
 * @author Libardo Pantoja
 */
public interface IDishRepository {
    /**
     * Busca un Customer por su ceduka
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
    public String createDish(Dish dish);

}
