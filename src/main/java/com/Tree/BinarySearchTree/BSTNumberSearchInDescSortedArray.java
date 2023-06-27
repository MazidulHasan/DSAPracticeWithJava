package temp;

public class BSTNumberSearchInDescSortedArray {
     public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
     }
     public static void main(String[] args) {
        // int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int[] descSortedArray = {13, 11,9, 7, 5, 3, 1};
        int targetNumber = 1;

        System.out.println("Index number is : "+binarySearch(descSortedArray, targetNumber));
     }
}
