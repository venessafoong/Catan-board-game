import java.util.Random;
public class Dice
{
    public static int rollDice()
    {
        Random rand = new Random();
        int die1 = rand.nextInt(1,7);
        int die2 = rand.nextInt(1,7);
        int sumOfTwoDice = die1 + die2;
        return sumOfTwoDice;
    }

}
