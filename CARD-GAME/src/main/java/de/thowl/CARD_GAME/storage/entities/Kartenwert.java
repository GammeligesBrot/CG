package de.thowl.CARD_GAME.storage.entities;

public enum Kartenwert 
{
    Sieben(7),
    Acht(8),
    Neun(9),
    Zehn(10),
    Bube(11),
    Dame(12),
    Koenig(13),
    Ass(14);

    private final int kWert;

    private Kartenwert(int wert)
    {
        this.kWert = wert;
    }

    public int getkWert(){
        return kWert;
    }
    
}
