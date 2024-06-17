package de.thowl.CARD_GAME.Cards;


public class Karte
{

    private Kartenfarbe kFarbe;
    private Kartenwert kWert;

    public Karte(Kartenwert kwert, Kartenfarbe kFarbe)
    {
        this.kFarbe = kFarbe;
        this.kWert = kWert;
    }
    

    public Kartenwert getkWert() {
        return kWert;
    }

    public void setkWert(Kartenwert kWert) {
        this.kWert = kWert;
    }

    public Kartenfarbe getkFarbe() {
        return kFarbe;
    }

    public void setkFarbe(Kartenfarbe kFarbe) {
        this.kFarbe = kFarbe;
    }



    /*public boolean Gleich(Karte andereKarte)
    {
        if(andereKarte == null)
        {
            return false;
        }
                else
            {
            return kfarbe == andereKarte.kfarbe &&
                    kwert == andereKarte.kwert;
            }
    }
*/
}
