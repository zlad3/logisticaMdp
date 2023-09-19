package com.sistema.gestion.chupaca.experience;

import com.sistema.gestion.chupaca.models.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistema.gestion.chupaca.services.CategoryService;
import java.util.Collection;

@RestController
@AllArgsConstructor
public class CategoryApi {

    private CategoryService categoryService;

    @GetMapping("/categories")
    public Collection<Category> getCategories() {
        return categoryService.getCategories();
    }

}
