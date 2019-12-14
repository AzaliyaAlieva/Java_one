package ru.geekbrains.java_one.lesson_d.online;

public class Employee {
    private String fullName;
    private String position;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, int salary, int phone, int age){
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
        this.age = age;
    }
    public String getFullName(){
        return fullName;
    }
    public String getPosition(){
        return position;
    }
    public int getSalary(){
        return salary;
    }
    public int getPhone(){
        return phone;
    }
    public int getAge(){
        return age;
    }

    public int setFullSalary(int salary) {
        if(getAge() > 45){
           salary += 5000;
        }
        return salary;
    }
}
