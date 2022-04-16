package features;

public class Main {

    public static void main(String[] args) {
	Products pie = FactoryProducts.getProduct(FactoryProducts.TypeOfProduct.SWEET);
        System.out.println("product \t:\t"+pie.name());
        System.out.println("calories\t:\t"+pie.calories());
        System.out.println("Price   \t:\t"+pie.price());
    }
}
