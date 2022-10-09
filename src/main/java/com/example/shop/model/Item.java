package com.example.shop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {

    private Long itemId;

    private String itemNm;

    private Category category;
}
