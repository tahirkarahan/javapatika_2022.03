package com.patika.java101.classconcept.salarycalculationsystem;


public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Fatih Mustafa",4500,45,2000);
        System.out.println(emp1.toString());
        Employee emp2=new Employee("Hasan Yıldırım",1000,60,2015);
        System.out.println(emp2.toString());
        Employee emp3=new Employee("Dilek Çetındağ",3500,50,2010);
        System.out.println(emp3.toString());

    }
}
