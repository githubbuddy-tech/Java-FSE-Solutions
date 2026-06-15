package DeepSkilling.DataStructures.E_commercePlatformSearchFunction;

public class Product {
     int productId;
     String productName;
     String Category;


    public Product(int productId,String productName,String Category)
    {
        this.productId=productId;
        this.productName=productName;
        this.Category=Category;
    }

    @Override
    public String toString()
    {
        return "productId-> "+this.productId+" \nproduct name-> "+this.productName+"\nproduct Category-> "+this.Category;
    }
}
