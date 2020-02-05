package com.company;

public class Dog extends Animal implements Drawable , SoundProducable {

    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(int age, String name) {
        super.setName(name);
        this.age = age;
    }

    @Override
    public String draw() {
        return "\uD83D\uDC36";
    }


    @Override
    public String callSound() {
        return "GAV-GAV";
    }
}
