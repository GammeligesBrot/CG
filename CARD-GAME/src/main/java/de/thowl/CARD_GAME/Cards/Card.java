package de.thowl.CARD_GAME.Cards;

import CardType;
import de.thowl.CARD_GAME.Cards.CardValue;
@Data


public class Card : IEquatable<Card>
{

    private String CardId;
    private CardType Type;
    private CardValue Value;
    private String Card;

    public Karte(CardType cType, CardValue cValue)
    {
        Type = cType;
        Value = cValue;
        

    }
    public string CreateCards() {
        for (int i = 0; i < 8; i++) {
            
        }
    }
}
