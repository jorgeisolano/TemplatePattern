/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mycompany.restaurant.server.infra;

import co.mycompany.restaurant.server.domain.services.DishService;
import co.unicauca.serversocket.serversockettemplate.infra.ServerSocketTemplate;
import com.google.gson.Gson;
import co.mycompany.restaurant.commons.domain.Dish;
import co.mycompany.restaurant.commons.infra.Protocol;
import co.mycompany.restaurant.commons.infra.Utilities;
import co.mycompany.restaurant.server.access.Factory;
import co.mycompany.restaurant.server.access.IDishRepository;

/**
 *
 * @author Jorge Ivan
 */
public class ServerSocketRestaurant extends ServerSocketTemplate{
    private DishService service;
    
    @Override
    protected ServerSocketTemplate init() {
        PORT = Integer.parseInt(Utilities.loadProperty("server.port"));
         // Se hace la inyección de dependencia
        IDishRepository repository = Factory.getInstance().getRepository();
        this.setService(new DishService(repository));
        return this;
    }

    @Override
    protected void processRequest(String requestJson) {
        // Convertir la solicitud a objeto Protocol para poderlo procesar
        Gson gson = new Gson();
        Protocol protocolRequest = gson.fromJson(requestJson, Protocol.class);

        switch (protocolRequest.getResource()) {
            case "restaurante":
                if (protocolRequest.getAction().equals("set")) {
                    // Agregar un dish    
                    processPostDish(protocolRequest);
                }
                break;
        }
    }

    private void processPostDish(Protocol protocolRequest) {
        Dish dish = new Dish();
        // Reconstruir el dish a partid de lo que viene en los parámetros
        dish.setDishName(protocolRequest.getParameters().get(0).getValue());
        dish.setDishPrice(protocolRequest.getParameters().get(1).getValue());
        dish.setDishDescription(protocolRequest.getParameters().get(2).getValue());
        String response = getService().createDish(dish);
        respond(response);
    }
    
    public DishService getService() {
        return service;
    }
    public void setService(DishService service) {
        this.service = service;
    }
    
}
