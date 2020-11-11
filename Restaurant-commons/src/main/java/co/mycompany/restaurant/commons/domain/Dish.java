package co.mycompany.restaurant.commons.domain;

import java.util.Date;

/**
 * Cliente de la agencia de viajes
 *
 * @author Libardo, Julio
 */
public class Dish {

    private String dishName;
    /**
     * Apellidos
     */
    private String dishPrice;
    /**
     * Dirección de residencia
     */
    private String dishDescription;


    public Dish(String dishName, String dishPrice, String dishDescription) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dishDescription = dishDescription;

    }
    public Dish(){
        
    }
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }



}
