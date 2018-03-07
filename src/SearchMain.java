/**
 * Created by michael_hopps on 3/7/18.
 */
public class SearchMain {
    public static void main(String[] args) {
        int[] testArray = {4, 1, 6, 8, 9, 18, 12, -4, 5, 9, 15, 34, 42, 101};

        Searcher mySearcher = new Searcher(testArray);

        System.out.println(mySearcher.sequentialSearch(9));
        System.out.println(mySearcher.sequentialSearchRecursive(9, 0));

        System.out.println(mySearcher.sequentialSearch(9000));
        System.out.println(mySearcher.sequentialSearchRecursive(9000, 0));

        System.out.println(mySearcher.sequentialSearch(101));
        System.out.println(mySearcher.sequentialSearchRecursive(101, 0));

    }
}
