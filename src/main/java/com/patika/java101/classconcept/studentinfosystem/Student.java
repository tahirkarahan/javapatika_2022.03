package com.patika.java101.classconcept.studentinfosystem;

public class Student {
    /* Student Class Properties:
    Attributes : name,stuNo,classes,course1,course2,course3,average,isPass
    Methods: Student(), addBulkExamNote(), isPass(), calcAverage(), printNote()
*/
    String name;
    String studentNo;
    int classes;
    Course math;
    Course physic;
    Course chemistry;
    double average;
    boolean isPass;

    //default constructor
    public Student() {
    }

    public Student(String name, String studentNo, int classes, Course math, Course physic, Course chemistry) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        calAverage();
        this.isPass = false;
    }

    public void addBulkExamScore(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.score = math;
        }
        if (physic >= 0 && physic <= 100) {
            this.physic.score = physic;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.score = chemistry;
        }
    }

    public void isPass() {
        if (this.math.score == 0 || this.physic.score == 0 || this.chemistry.score == 0) {
            System.out.println("Scores not fully entered!!!");
        } else {
            this.isPass = isCheckPass();
            printScore();
            System.out.println(String.format("Average:%.2f", average));
        }
        if (this.isPass)
            System.out.println("Congratulations! Passed the exam Successfully!!");
        else System.out.println("It is so pity, you failed the exam, Hard work please");
    }

    public void calAverage() {
        this.average = (this.math.score + this.physic.score + this.chemistry.score) / 3.0;
    }

    public boolean isCheckPass() {
        calAverage();
        return this.average > 55;
    }

    public void printScore() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Score : " + this.math.score);
        System.out.println("Physic Score : " + this.physic.score);
        System.out.println("Chemistry Score : " + this.chemistry.score);
    }

}
