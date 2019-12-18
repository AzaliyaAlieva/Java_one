package ru.geekbrains.java_one.lesson_e.online;

public class Cat extends Animal {
    final int run = 200;
    final double jump = 2;
    final int swim = 0;
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(int r) {
        if(r <= run)
            System.out.println(name + " добежал!");
        else
            System.out.println(name + " не смог добежать :(");
    }
    @Override
    public void jump(double j){
        if(j <= jump)
            System.out.println(name + " перепрыгнул препятствие!");
        else
            System.out.println(name + " не смог перепрыгнуть :(");
    }
    @Override
    public void swim(int s){
        if(s >= swim)
            System.out.println(name + " не умеет плавать:(");
    }
}
