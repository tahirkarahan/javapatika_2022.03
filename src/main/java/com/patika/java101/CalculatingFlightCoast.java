package com.patika.java101;

import java.util.Scanner;

public class CalculatingFlightCoast {
    public static void main(String[] args) {
        /*olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        int distance, age, tripType;
        double normalPrice, discountedPrice = 0, doubleDiscountPrice = 0, totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter passenger's age:");
        age = input.nextInt();
        System.out.print("Please enter trip distance(km):");
        distance = input.nextInt();
        normalPrice = distance * 0.10;
        System.out.println("Please select trip type\n1.one-way\n2.double-way");
        tripType = input.nextInt();

        // 1-way
        if (age <= 12) {
            discountedPrice = normalPrice * 0.5;
        } else if (age <= 24) {
            discountedPrice = normalPrice * 0.1;
        } else if (age > 65) {
            discountedPrice = normalPrice * 0.3;
        }
        totalPrice = normalPrice - discountedPrice;
        switch (tripType) {
            case 1:
                break;
            case 2:
                doubleDiscountPrice = totalPrice * 0.2;
                totalPrice = (totalPrice - doubleDiscountPrice) * 2;
                break;

            default:
                System.out.println("you enter a wrong number");
        }
        System.out.print("total:" + totalPrice + " TL");

        // 2-way
//        if (age <= 12) {
//            discountedPrice = normalPrice * 0.5;
//        }
//        if (12 < age && age <= 24) {
//            discountedPrice = normalPrice * 0.1;
//        }
//        if (age > 65) {
//            discountedPrice = normalPrice * 0.3;
//        }
//        totalPrice = normalPrice - discountedPrice;

//        if (tripType == 2) {
//            doubleDiscountPrice = totalPrice * 0.2;
//            totalPrice = (totalPrice - doubleDiscountPrice) * 2;
//        }
//        System.out.print("total:" + totalPrice + " TL");
    }
}
