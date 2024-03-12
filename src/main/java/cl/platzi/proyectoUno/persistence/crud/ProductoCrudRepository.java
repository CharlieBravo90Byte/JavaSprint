package cl.platzi.proyectoUno.persistence.crud;

import cl.platzi.proyectoUno.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    //Opcion 1
    /*
    @Query(value = "SELOECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    List<Producto> getIdCategoria(int idCategoria);
    */
    //Opcion 2
    // Simple findByIdCategoria
    // Ordernar por Nombre findByIdCategoriaOrderByNombreAsc
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);

}
