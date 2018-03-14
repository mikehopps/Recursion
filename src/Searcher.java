/**
 * Created by michael_hopps on 3/7/18.
 */

/*
a search method takes in a key value.
it will return the index of that key value
in arr.  If key is not in arr, return -1.
 */
public class Searcher {

    private int[] arr;

    public Searcher(int[] arr) {
        this.arr = arr;
    }

    //returns the index of key in arr.
    public int sequentialSearch(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public int sequentialSearchRecursive(int key, int i) {
        if (arr[i] == key)
            return i;
        if (i == arr.length - 1)
            return -1;
        return sequentialSearchRecursive(key, i + 1);
    }

    public int binarySearch(int key) {
        int hi = arr.length - 1; //last index
        int lo = 0; //first index
        int mid;

        while (lo <= hi) {    //if our boundaries are in order…

            mid = (hi + lo) / 2;    //middle of current range.
            if (key == arr[mid])    //found it!  Return.
                return mid;
            else if (key < arr[mid])    //key is less than mid – lower hi.
                hi = mid - 1;
            else
                lo = mid + 1;        //key is more than mid – raise lo.
        }
        return -1;    //never found it.  Return -1.
    }



    public int binarySearchRecursion(int key, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high) / 2;
        if(key == arr[mid])
            return mid;

        if(key > arr[mid])
            return binarySearchRecursion(key, mid+1, high);
        else
            return binarySearchRecursion(key, low, mid-1);
    }
}



