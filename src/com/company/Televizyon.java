package com.company;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acık;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka,String boyut){
        this.marka=marka;
        this.boyut=boyut;
        kanallar =new ArrayList<>();
        ses =10;
        aktifKanal=1;
        kanallarıOlustur();
        this.acık =false;

    }
    public void sesArttir(){
        if (ses < 20 && acık==true){
            ses++;
            System.out.println("ses seviyesi " +ses);
        }else {
            System.out.println("Ses maximumda daha fazla arttıramazsınız veya tv kapalı");
        }
    }
    public void sesAzalt(){
        if (ses > 0 && acık){
            ses--;
            System.out.println("ses seviyesi "+ses);
        }else {
            System.out.println("Ses minumumda daha fazla azaltamazsınız.");
        }
    }
    public void tvAc(){
        if (acık==false){
            acık=true;
            System.out.println("Tv açık");
        }else {
            System.out.println("Tv zaten açık");
        }
    }
    public void tvKapat(){
        if (acık==true){
            acık=false;
            System.out.println("Tv kapalı");
        }else {
            System.out.println("Tv zaten kapalı");
        }
    }

    private void kanallarıOlustur() {
        HaberKanalı cnn =new HaberKanalı("CNN" ,1 ,"GenelHaber");
        kanallar.add(cnn);
        HaberKanalı bein =new HaberKanalı("BeinSport" ,3 ,"Spor");
        kanallar.add(bein);
        MüzikKanalı dreamTurk=new MüzikKanalı("DreamTürk",2,"Yerli");
        kanallar.add(dreamTurk);
        MüzikKanalı number=new MüzikKanalı("NumberOne",4,"Yabancı");
        kanallar.add(number);

    }
    public void aktifKanalGoster(){
        if (acık)
        System.out.println("Aktif Kanal"+kanallar.get(aktifKanal).kanalBilgisiniGoster());
        else System.out.println("Önce tv yi açınız.");
    }
    public void kanalDegistir(int acılmasıIstenilenKanal){
        if (acık){
            if (acılmasıIstenilenKanal !=aktifKanal){

                if (acılmasıIstenilenKanal <=kanallar.size() &&acılmasıIstenilenKanal >=0){
                    aktifKanal=acılmasıIstenilenKanal;
                    System.out.println("Kanal " +acılmasıIstenilenKanal+ "Bilgi "+kanallar.get(aktifKanal -1).kanalBilgisiniGoster());
                }else {
                    System.out.println("Geçerli bir kanal numarası giriniz.");
                }

            }else {
                System.out.println("Zaten "+aktifKanal+ ". kanaldasınız.");
            }

        }else {
            System.out.println("Önce tv yi açınız.");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka : "+marka+"Boyut : "+boyut+ "olan tv oluşturuldu. ";
    }
}
