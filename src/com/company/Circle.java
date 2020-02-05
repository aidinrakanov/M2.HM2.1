package com.company;

public class Circle extends Figure{
        private int radius;
        public static final double PI = 3.14;

        public Circle(String name, int radius) {
                super.setName(name);
                this.radius = radius;
        }

        public int getRadius() {
                return radius;
        }

        public void setRadius(int radius) {
                this.radius = radius;
        }


        @Override
        public double calculatePerimeter() {
                return 2 * PI* radius;
        }

        @Override
        public String draw() {
                return "🔴";
        }
}
