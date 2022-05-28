package com.patika.java101.classconcept.boxing;

public class Match {
    public Fighter f1;
    public Fighter f2;
    public double rangeWeight;
    public double extractWeight;
    public boolean isTrueWeight;
    public boolean evenOdd;

    public Match(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.rangeWeight = 20D; // dövüşçüler arasında ki en fazla kilo farkı
        this.extractWeight = Math.abs(this.f1.weight - this.f2.weight); // dövüşçülerin kilolarının farkının mutlak değeri
        this.isTrueWeight = this.extractWeight <= this.rangeWeight;
        this.evenOdd = (int) (Math.random() * 100) % 2 == 0; // rastgele sayı seçilir, tek çift hesabı yapılır ve dövüşçülerin  evenOdd değeri ile karşılatırılır

    }

    public void run() {
        if (!this.isTrueWeight) { // dövüşçüler arasında ki kilo farkı en fazla rangeWeight değeri kadar olsun
            System.out.println("Sikletler uyuşmuyor! Kilo farkları en fazla 10 Kg olabilir!");
        } else {
            if (this.f1.evenOdd == this.f2.evenOdd) { // f1 ve f2 nin evenOdd değeri aynı oalbilir. Aynı ise birinin diğerine değilini atıyoruz
                this.f1.evenOdd = !this.f1.evenOdd;
            }
            if (this.f1.evenOdd == this.evenOdd) { // bir üsteki if bloğu burdaki karşılaştırma için gerekli, burada f1 ve f2 nin evenOdd değerleri ile Match sınıfının evenOdd
                // değerini karşılaştırıyoruz aynı olan ilk vuruşa başlıyor
                subRun(this.f2, this.f1); // altaki subRun() fonksiyonun parametreleri incelenirse  buradan giden argümanların sebebi anlaşılacaktır.
            } else {
                subRun(this.f1, this.f2);
            }
        }
    }

    public void subRun(Fighter sonrakiVuracak, Fighter ilkVuracak) { // üsteki run fonksiyonunda ilk vurana göre burada alt fonksiyonda sırası ile vuruşları gerçkeleştiriyoruz
        System.out.println(ilkVuracak.nickName + " Dövüşe başladı");
        int round = 1;
        while (sonrakiVuracak.health > 0 && ilkVuracak.health > 0) {
            System.out.println("=======" + round + ".Round" + "=======");
            sonrakiVuracak.health = ilkVuracak.hit(sonrakiVuracak);
            System.out.println(sonrakiVuracak.nickName + " Kalan Sağlık: " + sonrakiVuracak.health);
            if (this.checkWin()) {
                break;
            }
            ilkVuracak.health = sonrakiVuracak.hit(ilkVuracak);
            System.out.println(ilkVuracak.nickName + " Kalan Sağlık: " + ilkVuracak.health);
            if (this.checkWin()) {
                break;
            }
            round++;
        }
    }

    public boolean checkWin() {
        if (this.f1.health == 0) {
            System.out.println("==============");
            System.out.println(this.f2.nickName + " Kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("==============");
            System.out.println(this.f1.nickName + " Kazandı!");
            return true;
        }
        return false;
    }

    public void showFighterInfo() {
        this.f1.showFightersInfo();
        this.f2.showFightersInfo();

    }
}
