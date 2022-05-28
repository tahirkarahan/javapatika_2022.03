package com.patika.java101.classconcept.boxing;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ferid", 88);
        Fighter f2 = new Fighter("Serdar", 78);
        Match m1 = new Match(f1, f2);
        m1.showFighterInfo();
        m1.run();
    }
}
