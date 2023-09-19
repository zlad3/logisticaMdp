package com.sistema.gestion.chupaca.experience;

import lombok.AllArgsConstructor;
import com.sistema.gestion.chupaca.models.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistema.gestion.chupaca.services.ProductService;

import java.util.Collection;

@RestController
@AllArgsConstructor
public class ProductApi {

    public ProductService productService;

    @GetMapping("/products")
    public Collection<Products> getProducts() {
        return productService.getProducts();
    }

}
