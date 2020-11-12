
package co.mycompany.restaurant.client.access;

import co.mycompany.restaurant.client.infra.RestaurantSocket;
import co.mycompany.restaurant.commons.domain.Dish;
import co.mycompany.restaurant.commons.infra.JsonError;
import co.mycompany.restaurant.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jorge Ivan Solano- Juan Pablo Solarte
 * 
 * Servicio de Restaurante. Permite hacer el CRUD de restaurantes solicitando los
 * servicios con la aplicación server. Maneja los errores devueltos
 */
public class RestauranteAccessImplSockets implements IRestaurantAccess{

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private RestaurantSocket mySocket;

    public RestauranteAccessImplSockets() {
        mySocket = new RestaurantSocket();
    }
    
    /**
     * Crea un Dish. Utiliza socket para pedir el servicio al servidor
     * @param dish plato de restaurante
     * @return nombre del plato creado
     * @throws Exception error en creacion del plato
     */
    @Override
    public String addDish(Dish dish) throws Exception {
        String jsonResponse = null;
        String requestJson = addDishRequestJson(dish);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(RestauranteAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(RestauranteAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente el menu, devuelve los nombres de los platos
                return jsonResponse;
            }
        }
    }
    
    /**
     * Crea la solicitud json de creación del dish para ser enviado por el
     * socket
     *
     * @param dish objeto Dish
     * @return devulve algo como:
     * {"resource":"restaurante","action":"set","parameters":[{"Nombre Plato":"nombre"...}}]}
     */
    private String addDishRequestJson(Dish dish) {

        Protocol protocol = new Protocol();
        protocol.setResource("restaurante");
        protocol.setAction("set");
        protocol.addParameter("Nombre Plato", dish.getDishName());
        protocol.addParameter("Precio Plato", dish.getDishPrice());
        protocol.addParameter("Descripción Plato", dish.getDishDescription());
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        return requestJson;
    }
    
    /**
     * Extra los mensajes de la lista de errores
     * @param jsonResponse lista de mensajes json
     * @return Mensajes de error
     */
    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }
    
    /**
     * Convierte el jsonError a un array de objetos jsonError
     *
     * @param jsonError
     * @return objeto MyError
     */
    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }
}
