package ru.geekbrains.java_one.lesson_d.online;

import java.util.Arrays;

public class DZ_Alieva_Azaliya_4 {

    static Employee[] array = new Employee[5];

    public static void main(String[] args) {
        array[0] = new Employee("Петров Иван Иванович", "Менеджер", 25000,
                8889990, 50);
        array[1] = new Employee("Дмитриева Елизавета Григорьевна", "Бухгалтер", 30000,
                9999999, 39);
        array[2] = new Employee("Толстой Лев Николаевич", "Директор", 50000,
                7777777, 41);
        array[3] = new Employee("Сухлов Петр Иванович", "Кладовщик", 35000,
                6666666, 47);
        array[4] = new Employee("Назаров Юрий Анатольевич", "Аналитик", 40000,
                5555555, 28);

        System.out.println(array[0].getFullName() + " " + array[0].getPosition());
        System.out.println(array[1].getFullName() + " " + array[1].getPosition());
        System.out.println(array[2].getFullName() + " " + array[2].getPosition());
        System.out.println(array[3].getFullName() + " " + array[3].getPosition());
        System.out.println(array[4].getFullName() + " " + array[4].getPosition());

        for(int i = 0; i < array.length; i++){
                if(array[i].getAge() > 40) {
                    System.out.println(array[i].getFullName() + " " + array[i].getPosition() + " " + array[i].getSalary()
                    + " " + array[i].getPhone() + " " + array[i].getAge());
                }
        }
        incrSalary();
    }

    private static void incrSalary() {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 45) {
                value = array[i].getSalary() + 5000;
                System.out.println(array[i].getFullName() + " " + array[i].getPosition() + " " + value
                        + " " + array[i].getPhone() + " " + array[i].getAge());
            }
        }

    }
}
