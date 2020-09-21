package com.company;

public class HaberKanalı extends  Kanal {
    private String haberTuru;


    public HaberKanalı(String adi, int kanalNo,String tur) {
        super(adi, kanalNo);
        this.haberTuru=tur;
    }
}
