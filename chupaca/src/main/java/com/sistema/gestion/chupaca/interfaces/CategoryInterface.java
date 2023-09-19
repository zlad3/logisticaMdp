package com.sistema.gestion.chupaca.interfaces;

import com.sistema.gestion.chupaca.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryInterface extends JpaRepository<Category, Integer> { }
