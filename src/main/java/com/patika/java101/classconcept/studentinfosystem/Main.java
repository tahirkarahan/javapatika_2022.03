package com.patika.java101.classconcept.studentinfosystem;

public class Main {
    //Student info system
    public static void main(String[] args) {
        Course c1 = new Course("Math", "101", "MAT");
        Course c2 = new Course("Physic", "102", "PHY");
        Course c3 = new Course("Chemistry", "103", "CHEM");

        Teacher t1 = new Teacher("Mr Fatih", "0550000001", "MAT");
        Teacher t2 = new Teacher("Mis.Saliha", "0550000002", "PHY");
        Teacher t3 = new Teacher("Mr.Borhan", "0550000003", "CHEM");
        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Alim", "1001", 3, c1, c2, c3);
        s1.addBulkExamScore(40, 75, 55);
        s1.isPass();

        Student s2 = new Student("Adile", "1002", 3, c1, c2, c3);
        s2.addBulkExamScore(75, 89, 90);
        s2.isPass();

        Student s3 = new Student("Ferid", "1003", 3, c1, c2, c3);
        s3.addBulkExamScore(30, 65, 56);
        s3.isPass();
    }

}
