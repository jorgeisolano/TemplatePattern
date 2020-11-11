/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mycompany.restaurant.client.presentation;

import co.mycompany.restaurant.commons.domain.Dish;

/**
 *
 * @author Jorge Ivan
 */
public class Main {
    
    private static RestaurantController atrControlador = RestaurantController.getInstance();
    public static void main(String[] args) throws Exception {
        Dish dish1 = new Dish("Carne asada","20000","100 g de res");
        Dish dish2 = new Dish("Pechuga a la plancha","15000","200 g de pavo");
        System.out.println("El nombre del plato agregado es: "+ atrControlador.addDish(dish1));
        System.out.println("El nombre del plato agregado es: "+ atrControlador.addDish(dish2));
    }    
}
