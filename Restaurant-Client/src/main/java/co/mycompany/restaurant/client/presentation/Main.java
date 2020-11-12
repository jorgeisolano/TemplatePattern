package co.mycompany.restaurant.client.presentation;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 * 
 * Main que comprueba el funcionamiento del cliente y servidor corriendo con template
 */
public class Main {
    
    /**
     * instancia del controlador unico
     */
    private static RestaurantController atrControlador = RestaurantController.getInstance();
    public static void main(String[] args) throws Exception {
        
        /**
         * platos a añadir en el repositorio
         */
        Dish dish1 = new Dish("Carne asada","20000","100 g de res");
        Dish dish2 = new Dish("Pechuga a la plancha","15000","200 g de pavo");
        
        /**
         * Imprecion de los nombres de los platos que se han creado en el servidor
         */
        System.out.println("El nombre del plato agregado es: "+ atrControlador.addDish(dish1));
        System.out.println("El nombre del plato agregado es: "+ atrControlador.addDish(dish2));
    }    
}
