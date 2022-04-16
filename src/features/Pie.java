package features;

public class Pie implements Products{

    private String name;
    private double price;
    private int calories;

    public Pie( double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String name() {
        return "Pie";
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public int calories() {
        return calories;
    }
}
