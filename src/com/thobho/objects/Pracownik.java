package com.thobho.objects;

public class Pracownik {

    //domyślnie dajemy wszędzi private

    private int pesel; // <- do przepisania na String
    private String płeć; // <-- // "K" "M", char płeć
    private int wiek; // <----



    public Pracownik(int pesel,String płeć,int wiek) {
        this.pesel = pesel;
        this.płeć = płeć;
        this.wiek = wiek;
    }

    //prezentuje nam jak wygląda stan pracownika (wyświetlPracownika)

    //settery i gettery
}