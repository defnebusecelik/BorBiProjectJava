package com.company;

public class BaseHesapla {
    private double yeniUcret;

    public double getYeniUcret() {

        return yeniUcret;
    }

    public void setYeniUcret(double yeniUcret) {
        this.yeniUcret = yeniUcret;
        if (yeniUcret < 0) {
            System.out.println("Hesaplanan ucret 0dan kuçuk olamaz");
        }

    }

    public double Indirim(double ucret, int yas) {
        if (yas > 5 && yas < 20) {
            yeniUcret = ucret * 0.8;
            System.out.println("indirimsiz fiyat :" + ucret);
            System.out.println("indirimli fiyat :" + yeniUcret);
            System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKURLER");

        } else if (yas > 40 && yas < 70) {
            yeniUcret = ucret * 0.9;
            System.out.println("indirimsiz fiyat :" + ucret);
            System.out.println("indirimli fiyat :" + yeniUcret);
            System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKURLER");
        } else {
            System.out.println("Indiriminiz bulunmamaktadir ucretiniz:" + ucret);
            System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKURLER");
        }
        return ucret;
    }

    public double Iade(double ucret) {
        yeniUcret = ucret / 2;
        System.out.println("odemeniz yapildi:" + yeniUcret);
        System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKURLER");

        return ucret;
    }

}

