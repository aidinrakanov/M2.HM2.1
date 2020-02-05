package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle("Круг",10);
        Circle c2 = new Circle("Круг 2",12);
        Square s1 = new Square("Квадрат", 8);
        Square s2 = new Square("Квадрат 2", 9);
        Triangle t1 = new Triangle("Треугольник", 3, 4, 5);
        Rectangle r1 = new Rectangle("Прямоугольник", 4, 6);


        Figure[] figures = new Figure[] {c1, c2, s1, s2, t1, r1};

        for (int i = 0; i <figures.length ; i++) {
            System.out.println(figures[i].getName() + " "
                    + figures[i].draw() + " " +  figures[i].calculatePerimeter());
        }

        Dog d1 = new Dog(6, "Tuzik");
        System.out.println(d1.getName() + " возраст " + d1.getAge() + " "
                + d1.callSound() + " " + d1.draw());


    }
}
