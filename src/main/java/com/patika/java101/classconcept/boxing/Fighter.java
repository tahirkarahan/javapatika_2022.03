package com.patika.java101.classconcept.boxing;

import java.util.Random;

public class Fighter {
    public String nickName;
    public int health;
    public double weight;
    public int damage;
    public int dodge;
    public boolean evenOdd;

   public Fighter(String nickName, double weight) {
        this.nickName = nickName;
        this.health = 100;
        this.weight = weight;
        this.evenOdd = getRandomNumber(1, 100) % 2 == 0; // dövüşçü tek-çift >> yazı tura hesabı kim maça ilk başlıyacak
        calcDamage();
        calcDodge();

    }

    public void calcDamage() { // kilosu az olan yüksek hasar vursun!
        if (this.weight >= 40 && this.weight < 50) {
            this.damage = getRandomNumber(40, 45);
        } else if (this.weight >= 50 && this.weight < 60) {
            this.damage = getRandomNumber(35, 40);
        } else if (this.weight >= 60 && this.weight < 70) {
            this.damage = getRandomNumber(30, 35);
        } else if (this.weight >= 70 && this.weight < 80) {
            this.damage = getRandomNumber(25, 30);
        } else if (this.weight >= 80 && this.weight < 90) {
            this.damage = getRandomNumber(20, 25);
        } else if (this.weight >= 90 && this.weight < 100) {
            this.damage = getRandomNumber(15, 20);
        } else if (this.weight >= 100 && this.weight < 110) {
            this.damage = getRandomNumber(10, 15);
        } else if (this.weight >= 110 && this.weight <= 140) {
            this.damage = getRandomNumber(5, 10);
        } else {
            System.out.println("Kilo aralığı 40-140 dahil arası girilmelidir!");
        }
    }

    public void calcDodge() { // kilosu fazla olanın bloklama oranı yüksek olsun!
        if (this.weight >= 40 && this.weight < 50) {
            this.dodge = getRandomNumber(5, 10);
        } else if (this.weight >= 50 && this.weight < 60) {
            this.dodge = getRandomNumber(10, 15);
        } else if (this.weight >= 60 && this.weight < 70) {
            this.dodge = getRandomNumber(15, 20);
        } else if (this.weight >= 70 && this.weight < 80) {
            this.dodge = getRandomNumber(20, 25);
        } else if (this.weight >= 80 && this.weight < 90) {
            this.dodge = getRandomNumber(25, 30);
        } else if (this.weight >= 90 && this.weight < 100) {
            this.dodge = getRandomNumber(30, 35);
        } else if (this.weight >= 100 && this.weight < 110) {
            this.dodge = getRandomNumber(35, 40);
        } else if (this.weight >= 110 && this.weight <= 140) {
            this.dodge = getRandomNumber(40, 45);
        }
    }

    public int getRandomNumber(int min, int max) { // bloklama ve hasar oranı için belli aralıktan sayı üretme methodu
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void showFightersInfo() {
        System.out.println("Nick:" + this.nickName);
        System.out.println("Sağlık:" + this.health);
        System.out.println("Hasar:" + this.damage);
        System.out.println("Blok:" + this.dodge);
        System.out.println("Kilo:" + this.weight);
        /* System.out.println("Tek(false)-Çift(true):" + this.evenOdd);*/
        System.out.println("=".repeat(20));
    }


    public int hit(Fighter foe) { // Dövüşçünün karşı dövüşçüye vurma davranışı
        System.out.print(this.nickName + " => " + foe.nickName + " " + this.damage + " hasar vurdu!\t");
        if (foe.isDodge()) {
            System.out.print(foe.nickName + " Hasarı blokladı!\t\t\t");
            return foe.health;
        } else {
            System.out.print(foe.nickName + " Hasarı bloklayamadı!\t\t");
            return Math.max(foe.health - this.damage, 0);
        }
    }

    public boolean isDodge() { // dövüşçünün bloklama hesabının yapılması
        int random = (int) (Math.random() * 40); // Match sınıfında while döngüsü içinde hit() methodu sürekli çağrılıcak, bu method ise
        // hit() içinde sürekli çağrıldığı için sürekli değişicek
        return random <= this.dodge; // this.dodge nesne,birkere üretildiği için değeri aynı kalıcak
    }
}

