package features;

public class FactoryProducts {
    public enum TypeOfProduct{
        SWEET, UNSWEETENED
    }

    private FactoryProducts (){}
    public static Products getProduct(TypeOfProduct typeOfProd){
        switch (typeOfProd){
            case UNSWEETENED : return new Bread(5.50,367);
            case SWEET : return new Pie(6.66,400);
            default : return null;
        }
    }
}
