package com.sistema.gestion.chupaca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @Column(name = "ID_CATEGORY")
    public Integer id;
    @Column(name = "NAME_CATEGORY")
    public String name;
    @Column(name = "DATE_CATEGORY")
    public String date;
}
