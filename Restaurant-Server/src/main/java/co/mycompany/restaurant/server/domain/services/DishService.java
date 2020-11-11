package co.mycompany.restaurant.server.domain.services;

import co.mycompany.restaurant.commons.infra.JsonError;
import co.mycompany.restaurant.commons.infra.Utilities;
import co.mycompany.restaurant.server.access.IDishRepository;
import com.google.gson.Gson;
import co.mycompany.restaurant.commons.domain.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio de clientes. Da acceso a la lógica de negocio
 *
 * @author Libardo, Julio
 */
public class DishService {

    /**
     * Repositorio de clientes
     */
    IDishRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo IDishRepository
     */
    public DishService(IDishRepository repo) {
        this.repo = repo;
    }



    /**
     * Crea un nuevo plato. Aplica validaciones de negocio
     *
     * @param dish plato
     * @return devuelve la cedula del customer creado
     */
    public String createDish(Dish dish) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if (dish.getDishName().isEmpty() || dish.getDishPrice().isEmpty()
                || dish.getDishDescription().isEmpty()) {
           errors.add(new JsonError("400", "BAD_REQUEST","Nombre, Precio y Descripción son obligatorios. "));
        }
        
        if(!Utilities.isNumeric(dish.getDishPrice())){
            errors.add(new JsonError("400", "BAD_REQUEST","Precio de plato móvil debe ser númerico"));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }             
        return repo.createDish(dish);
    }


}
