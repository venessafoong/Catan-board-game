import java.util.*;

public class Board
{
    private static List<String> hexes = // total 19
            Arrays.asList("forest","forest","forest","forest", // 4 wood-producing
                    "pasture","pasture","pasture","pasture",  // 4 sheep-producing
                    "field","field","field","field",  // 4 wheat-producing
                    "hill","hill","hill",  // 3 brick-producing
                    "mountain","mountain","mountain",  // 3 ore-producing
                    "desert");  // 1 non-resource-producing
    private static List<Integer> numTokens =
            Arrays.asList(2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12);

    public static void setUpGame()
    {
        Collections.shuffle(hexes);
        Collections.shuffle(numTokens);
    }
    public static void main(String[] args)
    {
        Board.setUpGame();
    }
}

