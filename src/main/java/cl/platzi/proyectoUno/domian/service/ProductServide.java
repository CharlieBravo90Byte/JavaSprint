package cl.platzi.proyectoUno.domian.service;

import cl.platzi.proyectoUno.domian.repository.ProductRepository;
import cl.platzi.proyectoUno.domian.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServide {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }


    public boolean delete(int productId){
        return getProduct(productId).map(product -> {
            productRepository.delete(productId); //elimino el registro para reornar el true
            return true;
                }).orElse(false); // o simplemente decir q es falso
    }

    /*
    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }*/
}
