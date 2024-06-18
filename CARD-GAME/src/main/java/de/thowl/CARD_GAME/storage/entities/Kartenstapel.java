package de.thowl.CARD_GAME.storage.entities;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Kartenstapel {

    private final ArrayList<Karte> Kartenstapel;

    public Kartenstapel()
    {
        this.Kartenstapel = new ArrayList<>();
        for(int i=0; i<4; i++)
        {
            Kartenfarbe farbe = Kartenfarbe.values()[i];
            for(int j=0; j<8; j++)
            {
                Karte karte = new Karte(Kartenwert.values()[j], farbe);
                this.Kartenstapel.add(karte);
            }
        }

        //Collections.shuffle(Kartenstapel);

    }
}
