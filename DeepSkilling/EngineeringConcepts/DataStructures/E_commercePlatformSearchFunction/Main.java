package DeepSkilling.DataStructures.E_commercePlatformSearchFunction;

public class Main {
    public static void main(String[] args) {
            Product[] products={
                    new Product(1,"Microven", "Electronics"),
                    new Product(2,"Refrigerator","Electronics"),
                    new Product(3,"Socks","Fashion"),
                    new Product(4,"specs","Fashion"),
                    new Product(5,"Antibiotics", "Medicine")

        };

            int val=1;

            Product product1=LinearSearch.linearSearch(products,val);
            System.out.println("Linear Search:");

        if(product1 != null)
            System.out.println("Product found-> \n"+product1);
        else
             System.out.println("not found");


            Product product2=BinarySearch.binarySearch(products,val);
        System.out.println("\n\nBinary Search:");

        if(product2 != null)
            System.out.println("Product found-> \n"+product2);
        else
            System.out.println("not found");
    }
}