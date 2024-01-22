package com.certidevs.asociaciones.manyToOne;

public class Editorial extends BaseEntity {

    private String name;
    private int year;

    public Editorial(long id) {
        super(id);
    }
}
