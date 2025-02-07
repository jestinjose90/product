package com.eshop.product.dto;

import com.eshop.product.entity.Category;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class CategoryDTO {
    private Long id; // Optional for POST request
    private String name;
    private String description;




}
