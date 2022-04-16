package features;

public class Bread implements Products{

    private String name;
    private double price;
    private int calories;

    public Bread( double price, int calories) {
        this.price = price;
        this.calories = calories;
    }
    @Override
    public String name() {
        return "Bread";
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
