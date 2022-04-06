public class Supplies extends Account {
    private int numberOfItems;
    private double pricePerItem;

    public Supplies() {
    }

    public Supplies(int numberOfItems, double pricePerItem, int ID) {
        this.accountID = ID;
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double calculateSales() {
        double sales = pricePerItem * numberOfItems;
        return sales;
    }

    public String toString() {
        return (super.toString() + "Number of Items: " + numberOfItems + "\n" +
                "Price per Item " + pricePerItem + "\n" +
                "Sales: " + calculateSales() + "\n");
    }
}
