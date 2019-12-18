package ru.geekbrains.java_one.lesson_e.online;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Кот Матроскин");
        Dog d = new Dog("Барбос");
        Bird b = new Bird("Кеша");
        Horse h = new Horse("Конек горбунок");
        Animal[] zoo = {c, d, b, h};

        for(int i = 0; i < zoo.length; i++){
            if(zoo[i] instanceof Cat)
                ((Cat) zoo[i]).run(200);
            if(zoo[i] instanceof Dog)
                ((Dog) zoo[i]).jump(0.5);
            if(zoo[i] instanceof Bird)
                ((Bird) zoo[i]).swim(2);
            if(zoo[i] instanceof Horse)
                ((Horse) zoo[i]).jump(50);
        }
    }
}
