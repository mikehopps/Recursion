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

    //sequential
    public int sequentialSearch(int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public int sequentialSearchRecursive(int key, int i){
        if(arr[i] == key)
            return i;
        if(i == arr.length - 1)
            return -1;
        return sequentialSearchRecursive(key, i + 1);
    }
}
