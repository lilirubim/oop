package com.certidevs.asociaciones.manyToOne;

public class Author extends BaseEntity{

    private String firstname;
    private String city;

    public Author(long id) {
        super(id);
    }
}
