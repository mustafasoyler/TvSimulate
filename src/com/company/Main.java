package com.company;

import java.util.Scanner;

public class Main {

     static Scanner tara=new Scanner(System.in);
     static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();
        boolean cıkıs=false;

        while (cıkıs ==false){
            System.out.println("Seçiminiz : (Menüyü görmek için 8 i tuşlayınız :) ");
            int secim =tara.nextInt();
            switch (secim){
                case 1:
                    tvKurveKanallarıOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttır();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor");
                    cıkıs=true;
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir sayı giriniz ");
                    break;
            }
        }
    }

    private static void kanalBilgisiniGoster() {
        if (tv !=null){
            tv.aktifKanalGoster();
        }else {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void kanalDegistir() {
        if (tv !=null){
            System.out.println("Hangi kanalı görmek istiyorsunuz ?");
            int acılmasıIstenilenKanal= tara.nextInt();
            tv.kanalDegistir(2);

        }else {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void sesArttır() {
        if (tv !=null){
            tv.sesArttir();
        }else  {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }
    private static void sesAzalt() {
        if (tv !=null){
            tv.sesAzalt();
        }else  {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvKapat() {
        if (tv !=null){
            tv.tvKapat();
        }else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvAc() {
        if (tv !=null){
            tv.tvAc();
        }else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvKurveKanallarıOlustur() {

        if (tv==null){
            tara.nextLine();
            System.out.println("Tv Markasını Giriniz:");
            String marka= tara.nextLine();
            System.out.println("Tv Boyutunu Giriniz:");
            String boyut = tara.nextLine();
            tv=new Televizyon(marka,boyut);
            System.out.println(tv);
        }else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("********MENU*********");
        System.out.println("0 ---- ÇIKIŞ \n"
        +"1 ---- TV Kur\n"
        +"2 ---- TV Aç\n"
                +"3 ---- Sesi Arttır\n"
                +"4 ---- Sesi Azalt\n"
                +"5 ---- Kanal Değiştir\n"
                +"6 ---- Kanal Bilgisini Göster\n"
                +"7 ---- TV Kapat\n"
                +"8 ---- Menüyü Göster\n");
    }
}
