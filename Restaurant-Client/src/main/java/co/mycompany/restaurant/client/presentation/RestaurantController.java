package co.mycompany.restaurant.client.presentation;

import co.mycompany.restaurant.client.access.IRestaurantAccess;
import co.mycompany.restaurant.client.access.RestauranteAccessImplSockets;
import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 * 
 * Clase contorlador(fachada) para el proceso de Cruds
 */
public class RestaurantController {
    
    /**
     * atributo de Singleton
     */
    private static RestaurantController instance;
    
    /**
     * servicio de acceso para conexion y envio de solicitudes al server
     */
    IRestaurantAccess service = new RestauranteAccessImplSockets();
    
    /**
     * Metodo de Singleton
     * @return 
     */
    public static RestaurantController getInstance() {
        if (instance == null) {
            instance = new RestaurantController();
        }
        return instance;
    }
    
    /**
     * Llama al servicio para que añada un plato en el server
     * @param dish objeto Dish
     * @return nombre del plato creado
     * @throws Exception error en creacion de dish
     */
    public String addDish(Dish dish)throws Exception{
        return service.addDish(dish);
    }
}
