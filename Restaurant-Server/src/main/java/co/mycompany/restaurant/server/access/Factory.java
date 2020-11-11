package co.mycompany.restaurant.server.access;

import co.mycompany.restaurant.commons.infra.Utilities;

/**
 * Fabrica que se encarga de instanciar un repositorio concreto
 *
 * @author Libardo, Julio
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia
     * ICustomerRepository
     *
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public IDishRepository getRepository() {
        String type = Utilities.loadProperty("dish.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        IDishRepository result = null;

        switch (type) {
            case "default":
                result = new DishRepositoryImplArrays();
                break;
        }
        return result;

    }
}
