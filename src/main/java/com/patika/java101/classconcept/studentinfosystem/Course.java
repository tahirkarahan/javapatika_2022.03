package com.patika.java101.classconcept.studentinfosystem;

public class Course {
    /*Course class Features:
    Attributes: name,code,prefix,note,Teacher
    Methods: Course() , addTeacher() , printTeacher()
     */
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int score;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.score = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Process completed successfully");
        } else {
            System.out.println(t.name + " Academician cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " course academician : " + courseTeacher.name);
        } else {
            System.out.println(this.name + "No academician has been assigned to your course.");
        }
    }
}
