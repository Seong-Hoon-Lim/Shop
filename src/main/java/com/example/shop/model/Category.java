package com.example.shop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Category {

    private Long categoryId;

    private Long parentId;

    private String categoryNm;
}
