package com.company;

public abstract class Figure implements Drawable{
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();


}
