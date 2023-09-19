package com.sistema.gestion.chupaca.services;

import com.sistema.gestion.chupaca.interfaces.ProductInterface;
import com.sistema.gestion.chupaca.models.Products;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductInterface productInterface;

    public Collection<Products> getProducts() {
        return productInterface.findAll();
    }

}
