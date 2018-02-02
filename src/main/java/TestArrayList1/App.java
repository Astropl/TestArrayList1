package TestArrayList1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    @Override
    public String toString() {
        return "App{}";
    }

    static Dane dane = new Dane();
    static Dane x = dane;
    public static void main(String[] args) {
        ArrayList <String> mojaLista = new ArrayList <String>();
        System.out.println(dane.getWyswietlListe());
        System.out.println();
//mojaLista.addAll(dane.getWyswietlListe());

        /*mojaLista.add("arek");
        mojaLista.add("bartek");
        mojaLista.add("paweł");
        mojaLista.add("maciek");
        mojaLista.add("józek");
        mojaLista.add("tomek");
        mojaLista.add("bolek");
        mojaLista.add("andrzej");
        mojaLista.add("marek");
        mojaLista.add("zenek");*/


        System.out.println(mojaLista);
/*mojaLista.add("adasds");
mojaLista.add("dgdsg");
mojaLista.add("aerewr");
mojaLista.add("fhtth");
mojaLista.add("bngjtj");*/


        for (String m : mojaLista)

            System.out.println(m);
        System.out.println("\n\n");
        Collections.sort(mojaLista);
        //mojaLista.sort;
        for (String m : mojaLista)

            System.out.println(m);

        //mojaLista.removeAll(mojaLista);

        //System.out.println("Hello World!");
        mojaLista.add("dwas");
        for (String m : mojaLista)

            System.out.println(m);
    }
}
