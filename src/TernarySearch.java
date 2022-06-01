/*
Ternary search is a searching technique  which is a divide and conquer algo and it is similar to binary search
as we divide the array but the only difference is that we divide the sorted array in three parts.
Time complexity-O(log3N)
space complexity-O(1)
 */
public class TernarySearch {
    static int search(int l,int r,int x,int arr[]){
        if (r>=l)//base case..........................
        {
            //find the two mids as we divide the array in three parts.........................................
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;
            //if x is found at mid1 than return mid1 else ...........................................
            if (arr[mid1]==x)
                return mid1;
            //if x is found at mid2 than return mid2 else.........................................
            if (arr[mid2]==x)
                return mid2;
            //if x is less than the mid1 than recur it to the first part........................
            if (x<arr[mid1])
                return search(l,mid1-1,x,arr);
            //if x is greater than the mid2 than recur it to third part...........................
            if (x>arr[mid2])
                return search(mid2+1,r,x,arr);
            //recur to the second(middle) part to search for x.........................................
            else
                return search(mid1+1,mid2-1,x,arr);

        }
        //if element x is not present in the array than return -1...........................................
        return -1;
    }
//driver code.......................................................
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int l=0;//starting index.............
        int r=arr.length;//ending index............
        int x=5;//element to be searched...........
        int p=search(l,r,x,arr);
        System.out.println("element"+x+"is present at"+p);
    }
}
