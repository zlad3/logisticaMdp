package com.sistema.gestion.chupaca.interfaces;

import com.sistema.gestion.chupaca.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductInterface extends JpaRepository<Products, Integer> { }
