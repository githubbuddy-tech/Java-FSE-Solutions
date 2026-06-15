package DeepSkilling.DataStructures.E_commercePlatformSearchFunction;

public class LinearSearch {

    public static Product linearSearch(Product[] product,int value){

        for (Product item : product) {
            if (item.productId == value) {
                return item;
            }
        }

        return null;
    }
}
