package com.patika.java101.classconcept.salarycalculationsystem;

import com.github.javafaker.Faker;

public class Employee {
    /*Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan
    bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
   * Sınıfın Nitelikleri
    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı
   * Sınıfın Metotları
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her
    saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
     */
    String name;
    int salary;
    int workHours;
    int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //calculate tax
    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        } else
            return 0.0;
    }

    // calculate bonus
    public double bonus() {
        if (workHours > 40) {
            return (this.workHours - 40) * 30;
        } else
            return 0.0;
    }

    // raise salary
    public double raiseSalary(int currentYear) {
        int workYear = currentYear - hireYear;
        if (workYear < 10)
            return this.salary * 0.05;
        else if (workYear < 20)
            return this.salary * 0.10;
        else return this.salary * 0.15;
    }

    //To String
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary(2021);
        double salaryWithTaxAndBonus = this.salary - tax() + bonus();

        System.out.println(" ======salary calculation of the employee====");
        return "name : " + this.name +
                "\nsalary : " + this.salary +
                "\nworkHours : " + this.workHours +
                "\nhireYear : " + this.hireYear +
                "\nTax : " + tax +
                "\nBonus : " + bonus +
                "\nSalary Increment : " + raiseSalary +
                "\nSalary with tax and bonus : " + salaryWithTaxAndBonus +
                "\nTotal salary : " + (salaryWithTaxAndBonus + raiseSalary);
    }
}
