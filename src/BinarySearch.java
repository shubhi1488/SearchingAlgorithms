/*
Binary search is a searching technique in which we divide the array in two parts and then search accordingly
i) we start searching from mid if the element is present at the mid we return its position
ii) if the element is smaller than the mid than we recur from left
iii)if the element is greater than the mid than we recur till right.
 */


public class BinarySearch {
    public static int search(int[] arr, int beg, int end, int x) {
        if (end >= beg) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return search(arr, beg, mid - 1, x);
            }
            if (arr[mid] < x) {
                return search(arr, mid + 1, end, x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 4, 10, 40 };
        int n=arr.length;
        int x=10;
        int res=search(arr,0,n-1,x);
        if (res==-1){
            System.out.println("element is not present in the array");
        }
        else {
            System.out.println("element is found at"+res);
        }
    }
}
