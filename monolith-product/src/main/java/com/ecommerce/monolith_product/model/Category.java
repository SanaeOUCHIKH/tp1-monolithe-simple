package com.ecommerce.monolith_product.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Optionnel : Relation inverse pour voir les produits d'une catégorie
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}