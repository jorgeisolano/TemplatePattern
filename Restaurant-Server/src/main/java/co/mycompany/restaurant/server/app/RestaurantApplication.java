package co.mycompany.restaurant.server.app;

import co.mycompany.restaurant.server.infra.ServerSocketRestaurant;

/**
 * Aplicación principal que lanza el servidor en un hilo
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public class RestaurantApplication {
    public static void main(String args[]){
        ServerSocketRestaurant server = new ServerSocketRestaurant();
        server.startServer();
    }
}
