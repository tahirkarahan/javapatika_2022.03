package com.patika.java102.incapsulation;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("King Of The Lord", "Henerry", 500);
        Book book2=new Book("IZ", "Abdurehim Otkur", 400);
        Book book3=new Book("Uyghurlar","Turgun Almas",-2000);
        System.out.println(book1);
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        book3.setPageNumber(2000);
        System.out.println(book3);

    }
}
