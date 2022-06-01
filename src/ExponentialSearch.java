import java.util.Arrays;
/*
Exponential search have time complexity as O(logn) and it works in two strps-
a) find range where element is present.
b) do binary search in above found range....
 */
public class ExponentialSearch {
    static int search(int arr[],int n,int x){
        //if the element x is present at the first index only ...............................
        if (arr[0]==x)
            return 0;
        //find range for binary search......................
        int i=1;
        while (i<=n && arr[i]<=x){
            i=i*2;
        }
        //call binary search method to find the element ..............................................................
        return Arrays.binarySearch(arr,i/2,Math.min(i,n-1),x);
    }
//driver code.....................................................................................................
    public static void main(String[] args) {
        int arr[]={2,3,4,10,40};
        int x=10;
        int result=search(arr,arr.length,x);
        System.out.println((result < 0) ?
                "Element is not present in array" :
                "Element is present at index " +
                        result);
    }
}
