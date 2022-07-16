package com.patika.java102.aboutstatic;

public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses("Math", 1, 75);
        Courses course2 = new Courses("History", 2, 65);
        Courses course3 = new Courses("Physic", 3, 80);
        Courses course4 = new Courses("chemistry", 4, 60);
        int[] note = {course1.note, course2.note, course3.note, course4.note};
        Calculate.calcAverage(note);
    }
}

