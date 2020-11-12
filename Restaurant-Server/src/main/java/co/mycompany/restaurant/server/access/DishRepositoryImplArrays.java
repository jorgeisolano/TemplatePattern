package co.mycompany.restaurant.server.access;

import co.mycompany.restaurant.commons.domain.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de IDishRepository. Utilliza arreglos en memoria
 *
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public final class DishRepositoryImplArrays implements IDishRepository {

    /**
     * Array List de dish
     */
    private static List<Dish> dishes;

    /**
     * Constructor de DishRepositoryImplArrays 
     */
    public DishRepositoryImplArrays() {
        if (dishes == null){
            dishes = new ArrayList();
        }
        if (dishes.size() == 0){
            inicializar();
        }
    }

    /**
     * Inicializa un dato el lista dish
     */
    public void inicializar() {
        dishes.add(new Dish("Carne asada","5000","100 g de res"));
    }
    
    @Override
    public String createDish(Dish dish) {
        dishes.add(dish);
        return dish.getDishName();
    }

}
