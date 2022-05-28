/*linear search algorithm-in this we start searching from left till right and if we got the element we update the
position as left  position if the element is not found in  the array we print element is not found with its number of
attemptss.
"Its time complesxity is O(1) which is the best case time complexity"

 */
public class LinearSearch {
    //search() method to search for the element-
    public static void search(int arr[],int k){
        int left=0;
        int n=arr.length;
        int right=n-1;
        int position=-1;
        for (left=0;left<=right;){
            //if the element is found at left than we update its position to left and update left and break.......
            if (arr[left]==k){
                position=left;
                System.out.println("element is found at position "+(position+1)+" position with "+(left+1)+" attempt");
                break;
            }
            //if the element is found at right than we update its position to right and decrease the right counter....
            if (arr[right]==k){
                position=right;
                System.out.println("element is found at position "+(position+1)+" position with "+(n-right)+" attempt");
                break;
            }
            left++;
            right--;
        }
        //if the element is not present in the array than we return the message..........
        if (position==-1){
            System.out.println("element not found in the array with "+left+" attempt");
        }
    }
//driver code..........................................................................................................
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        search(arr,k);
    }
}
