package deals;

public class Sale extends Deal {
    private String productName;
    private int productCost;

    public Sale(String productName, int productCost) {
        String comment = "Продажа " + productName + " на " + productCost + " руб.";
        super(comment, 0, productCost);
        this.productName = productName;
        this.productCost = productCost;
    }
}
