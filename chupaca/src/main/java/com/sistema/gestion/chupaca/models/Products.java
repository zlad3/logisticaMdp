package com.sistema.gestion.chupaca.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Products {
    @Id
    @Column(name = "ID_PRODUCT")
    private Integer id;
    @Column(name = "NAME_PRODUCT")
    private String name;
    @Column(name = "CATEGORY")
    private Integer category;
    @Column(name = "DESCRIPTION_PRODUCT")
    private String description;
    @Column(name = "STOCK")
    private Integer stock;
}
