package com.company;

public class MüzikKanalı extends Kanal{

    private String müzikTuru;

    public MüzikKanalı(String adi, int kanalNo,String müzikTuru) {
        super(adi, kanalNo);
        this.müzikTuru=müzikTuru;
    }
}
