package com.sistema.gestion.chupaca.services;

import com.sistema.gestion.chupaca.interfaces.CategoryInterface;
import com.sistema.gestion.chupaca.models.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryInterface categoryInterface;

    public Collection<Category> getCategories() {
        return categoryInterface.findAll();
    }

}
