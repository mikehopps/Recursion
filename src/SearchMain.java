import java.util.Arrays;

/**
 * Created by michael_hopps on 3/7/18.
 */
public class SearchMain {
    public static void main(String[] args) {
        int[] testArray = {-2, -1, 0, 1, 5, 8, 12, 13, 20, 24, 33, 34, 36, 42, 45, 100};

        Searcher mySearcher = new Searcher(testArray);

        System.out.println(mySearcher.binarySearchRecursion(8, 0, testArray.length-1));
        System.out.println(mySearcher.binarySearchRecursion(19, 0, testArray.length-1));
        System.out.println(mySearcher.binarySearchRecursion(100, 0, testArray.length-1));
        System.out.println(mySearcher.binarySearchRecursion(-2, 0, testArray.length-1));
        System.out.println(mySearcher.binarySearchRecursion(120, 0, testArray.length-1));
//        System.out.println(mySearcher.sequentialSearch(9));
//        System.out.println(mySearcher.sequentialSearchRecursive(9, 0));
//
//        System.out.println(mySearcher.sequentialSearch(9000));
//        System.out.println(mySearcher.sequentialSearchRecursive(9000, 0));
//
//        System.out.println(mySearcher.sequentialSearch(101));
//        System.out.println(mySearcher.sequentialSearchRecursive(101, 0));

    }
}
