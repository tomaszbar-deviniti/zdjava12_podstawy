package com.thobho.objects;

public class Firma {

    private Pracownik[] pracownicy;

    public Firma(){
        this.pracownicy = new Pracownik[100];
    }

    public void zatrudnijPracownika(Pracownik pracownik, int index){
        this.pracownicy[index] = pracownik;
    }

    public void pokazListePracownikow(){
        for (int i = 0; i < this.pracownicy.length; i++) {
            System.out.println(this.pracownicy[i]);
        }
    }


    public static void main(String[] args) {
        Firma sonyElectronics = new Firma();

        Pracownik pracownik1 = new Pracownik(123123123, "M", 19);

        sonyElectronics.zatrudnijPracownika(pracownik1, 0);

        sonyElectronics.pokazListePracownikow();

    }


    //naspisz metodę toString
}
