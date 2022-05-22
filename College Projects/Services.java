public class Services extends Account {
    private int numberOfHours;
    private double ratePerHour;

    public Services() {
    }

    public Services(int numberOfHours, double ratePerHour, int ID) {
        this.accountID = ID;
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double calculateSales() {
        double sales = ratePerHour * numberOfHours;
        return sales;
    }

    @Override
    public String toString() {
        return (super.toString() + "Rate per Hour: " + ratePerHour + "\n" +
                "Number of Hours " + numberOfHours + "\n" +
                "Sales: " + calculateSales() + "\n");
    }
}
