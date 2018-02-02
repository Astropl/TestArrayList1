package TestArrayList1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public  class  Dane   {
    public Collection<? extends String> wyswietlListe;

    public Dane(Collection <? extends String> wyswietlListe) {
        this.wyswietlListe = wyswietlListe;
    }

    @Override
    public String toString() {
        return "Dane{" +
                "wyswietlListe=" + wyswietlListe +
                '}';
    }

    public  Dane(String mojaLista1)
    {
        ArrayList<String> mojaLista1 = new ArrayList<String>();
        mojaLista1.add("arek");
        mojaLista1.add("bartek");
        mojaLista1.add("paweł");
        mojaLista1.add("maciek");
        mojaLista1.add("józek");
        mojaLista1.add("tomek");
        mojaLista1.add("bolek");

        mojaLista1.add("andrzej");
        mojaLista1.add("marek");
        mojaLista1.add("zenek");
        System.out.println(mojaLista1);
        return;
    }
    public void wyswietlListe()
    {
        System.out.println(Dane.super.toString());
    }

    public Collection <? extends String> getWyswietlListe() {
        return wyswietlListe;
    }

    public void setWyswietlListe(Collection <? extends String> wyswietlListe) {
        this.wyswietlListe = wyswietlListe;
    }
}
