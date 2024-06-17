package de.thowl.CARD_GAME.Cards;

public enum Kartenfarbe
 {
    Kreuz(2),
    Pik(3),
    Karo(4),
    Herz(5);

    
private final int kFarbe;
    
    private Kartenfarbe(int farbe)
    {
        this.kFarbe= farbe;
    }

    public int getFarbe(){
        return kFarbe;
    }
}
