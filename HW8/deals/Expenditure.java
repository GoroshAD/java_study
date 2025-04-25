package deals;

public class Expenditure extends Deal {
    private String productName;
    private int productCost;

    public Expenditure(String productName, int productCost) {
        String comment = "Покупка " + productName + " на " + productCost + " руб.";
        super(comment, productCost, 0);
        this.productName = productName;
        this.productCost = productCost;
    }
}
