package DeepSkilling.DataStructures.E_commercePlatformSearchFunction;

public class BinarySearch {
    public static Product binarySearch(Product[] products,int prodId){
        int len=products.length;
        int right=len-1;
        int left=0;

        while(left<=right){
            int mid=(left+right)/2;

            if(products[mid].productId==prodId)
                return products[mid];

            else if(products[mid].productId > prodId)
                right=mid-1;

            else
                left=mid+1;

        }
        return null;
    }

}
