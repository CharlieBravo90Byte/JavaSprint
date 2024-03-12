package cl.platzi.proyectoUno.domian.repository;

import cl.platzi.proyectoUno.domian.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
