//Interpolation search......................................................................
public class InterpolationSearch {
    public static int search(int[] arr, int lo, int hi, int x){
        int pos;

        // Since array is sorted, an element
        // present in array must be in range
        // defined by corner
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            // Probing the position with keeping
            // uniform distribution in mind.
            pos = lo
                    + (((hi - lo) / (arr[hi] - arr[lo]))
                    * (x - arr[lo]));

            // Condition of target found
            if (arr[pos] == x)
                return pos;

            // If x is larger, x is in right sub array
            if (arr[pos] < x)
                return search(arr, pos + 1, hi,
                        x);

            // If x is smaller, x is in left sub array
            if (arr[pos] > x)
                return search(arr, lo, pos - 1,
                        x);
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={ 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };
        int n=arr.length;
        int x=18;
        int index=search(arr,0,n-1,x);
        if (index!=1){
            System.out.println("element is found at:"+index);
        }
        else {
            System.out.println("element not found");
        }
    }
}
