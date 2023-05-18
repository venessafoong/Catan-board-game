import java.util.ArrayList;

public class Player
{
    private String name;
    private String colour;
    private ArrayList<String> cardsOnHand;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void rollDice()
    {
        Dice.rollDice();
    }

    public void gainResources(Cards ... resource)
    {
        //cardsOnHand.add();
    }

    public void discardResources(Cards ... resource)
    {
        //cardsOnHand.remove();
    }

}
