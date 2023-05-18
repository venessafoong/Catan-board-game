import java.util.*;

public class Bank {
    private static Map<String, Integer> totalCardsInBank =
            Map.of("ore", 19, "wheat", 19, "brick", 19, "wood",19, "sheep", 19);
    private static List<String> roadCost = Arrays.asList("brick", "wood");
    private static List<String> settlementCost = Arrays.asList("brick", "wood", "sheep", "wheat");
    private static List<String> cityCost = Arrays.asList("wheat", "wheat", "ore", "ore", "ore");
    private static List<String> devCardCost = Arrays.asList("sheep", "wheat", "ore");

    public static Map<String, Integer> getTotalCardsInBank() {
        return totalCardsInBank;
    }

    public static List<String> getRoadCost() {
        return roadCost;
    }

    public static List<String> getSettlementCost() {
        return settlementCost;
    }

    public static List<String> getCityCost() {
        return cityCost;
    }

    public static List<String> getDevCardCost() {
        return devCardCost;
    }
}
