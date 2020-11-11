package co.mycompany.restaurant.server.access;

import co.mycompany.restaurant.commons.domain.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de ICustomerRepository. Utilliza arreglos en memoria
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public final class DishRepositoryImplArrays implements IDishRepository {

    /**
     * Array List de clientes
     */
    private static List<Dish> dishes;

    public DishRepositoryImplArrays() {
        if (dishes == null){
            dishes = new ArrayList();
        }
        if (dishes.size() == 0){
            inicializar();
        }
    }

    public void inicializar() {
        dishes.add(new Dish("Carne asada","5000","100 g de res"));
    }
    
    @Override
    public String createDish(Dish dish) {
        dishes.add(dish);
        return dish.getDishName();
    }

}
