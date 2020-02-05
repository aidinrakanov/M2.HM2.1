package com.company;

public class Rectangle extends Figure{

private int sideA;
private int sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super.setName(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD36";
    }
}
