package com.niks.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    Integer id;
    String title;
    Integer pages;
    Author author;
}
