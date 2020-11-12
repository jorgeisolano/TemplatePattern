package co.mycompany.restaurant.commons.domain;

import java.util.Date;

/**
 * Dish de restautante
 *
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public class Dish {

    /**
     * nombre del plato
     */
    private String dishName;
    /**
     *precio del plato
     */
    private String dishPrice;
    /**
     * descripcion del plato
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
