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
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 */
public class ServerSocketRestaurant extends ServerSocketTemplate{
    
    /**
     * Servicio de clientes
     */
    private DishService service;
    
    /**
     * Inicialización
     * @return este mismo objeto
     */
    @Override
    protected ServerSocketTemplate init() {
        PORT = Integer.parseInt(Utilities.loadProperty("server.port"));
         // Se hace la inyección de dependencia
        IDishRepository repository = Factory.getInstance().getRepository();
        this.setService(new DishService(repository));
        return this;
    }

    /**
     * Procesar la solicitud que proviene de la aplicación cliente
     *
     * @param requestJson petición que proviene del cliente socket en formato
     * json que viene de esta manera:
     * "{"resource":"restaurant","action":"set","parameters":[...(parametros cliente...)]}"
     *
     */
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

    /**
     * Procesa la solicitud de consultar un customer
     *
     * @param protocolRequest Protocolo de la solicitud
     */
    private void processPostDish(Protocol protocolRequest) {
        Dish dish = new Dish();
        // Reconstruir el dish a partid de lo que viene en los parámetros
        dish.setDishName(protocolRequest.getParameters().get(0).getValue());
        dish.setDishPrice(protocolRequest.getParameters().get(1).getValue());
        dish.setDishDescription(protocolRequest.getParameters().get(2).getValue());
        String response = getService().createDish(dish);
        respond(response);
    }
    
     /**
     * @return the service
     */
    public DishService getService() {
        return service;
    }
    
    /**
     * @param service the service to set
     */
    public void setService(DishService service) {
        this.service = service;
    }
    
}
