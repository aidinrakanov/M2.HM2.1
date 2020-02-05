package com.company;

public class Square extends Figure{

    private int side;

    public Square(String name, int side) {
        super.setName(name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD32";
    }
}
