package com.eduar.misiontic.games2.repository;

import com.eduar.misiontic.games2.entities.Product;
import com.eduar.misiontic.games2.repository.crudRepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
    public Optional<Product> getProduct(int id){
        return productCrudRepository.findById(id);
    }

    public Product save(Product p){
        return productCrudRepository.save(p);

    }
    public void delete(Product p){
        productCrudRepository.delete(p);
    }
}
