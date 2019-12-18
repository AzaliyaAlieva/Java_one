package ru.geekbrains.java_one.lesson_e.online;

public abstract class Animal  {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void run(int r) {
        System.out.println(name + " пробежал " + r + "метров!");
    }
    public void jump(double s){
        System.out.println(name + " перепрыгнул препятствие в " + s + " метров в высоту!");
    }
    public void swim(int s){
        System.out.println(name + " проплыл " + s + " метров!");
    }

}
