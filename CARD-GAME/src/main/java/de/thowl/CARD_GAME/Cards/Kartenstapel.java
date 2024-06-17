package de.thowl.CARD_GAME.Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Kartenstapel {

    private final ArrayList<Karte> Kartenstapel;

    public Kartenstapel()
    {
        this.Kartenstapel = new ArrayList<>();
        for(int i=0; i<8; i++)
        {
            Kartenwert wert = Kartenwert.values()[i];
            for(int j=0; j<4; j++)
            {
                Karte karte = new Karte(wert, Kartenfarbe.values()[j]);
                this.Kartenstapel.add(karte);
            }
        }
        Collections.shuffle(Kartenstapel);

        Iterator<Karte> kartenIterator = Kartenstapel.iterator();
        while(kartenIterator.hasNext())
        {
            Object vKarte = kartenIterator.next();
            System.out.println(((Karte) vKarte).getkFarbe() + " " + ((Kartenwert) vKarte).getkWert());
        }
    }
}
