import java.util.ArrayList;

public class Player
{
    private String name;
    private String colour;
    private ArrayList<String> cardsOnHand;
    private ArrayList<String> initialResource;
    private int builtRoads;
    private int builtSettlements;
    private int builtCities;
    private int devCards;
    private int maxRoads = 15;
    private int maxSettlements = 5;
    private int maxCities = 4;

    public Player(String name, String colour, ArrayList<String> initialResources)
    {
        this.name = name;
        this.colour = colour;
        this.initialResource = initialResources;
    }

    public void rollDice()
    {
        Dice.rollDice();
    }

//    public void gainResources(Cards ... resource)
//    {
//        cardsOnHand.add();
//    }
//
//    public void discardResources(Cards ... resource)
//    {
//        cardsOnHand.remove();
//    }

    public void buyRoad()
    {
        if (cardsOnHand.containsAll(Bank.getRoadCost()))
        {
            cardsOnHand.removeAll(Bank.getRoadCost());
            builtRoads++;
        } else
            System.out.println("Not enough resources");
    }

    public void buySettlement() {
        if (cardsOnHand.containsAll(Bank.getSettlementCost()))
        {
            cardsOnHand.removeAll(Bank.getSettlementCost());
        builtSettlements++;
        } else
            System.out.println("Not enough resources");
    }

    public void buyCity()
    {
        if (cardsOnHand.containsAll(Bank.getCityCost()))
        {
            cardsOnHand.removeAll(Bank.getCityCost());
            builtCities++;
        } else
            System.out.println("Not enough resources");
    }

    public void buyDevCard()
    {
        if (cardsOnHand.containsAll(Bank.getDevCardCost())) {
            cardsOnHand.removeAll(Bank.getDevCardCost());
            devCards++;
        } else
            System.out.println("Not enough resources");
    }

}
