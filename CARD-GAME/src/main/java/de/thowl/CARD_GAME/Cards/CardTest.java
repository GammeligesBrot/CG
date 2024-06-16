
public class CardTest {

    public void TestMethod()//zwei karten mit selber wert gelten als gleich
    {
        var karte1 = new Karte(CardType.Herz, CardValue.Koenig);
        var karte2 = new Karte(CardType.Herz, CardValue.Koenig);
    
        Assert.IsTrue(karte1 == karte2);
    }

}
