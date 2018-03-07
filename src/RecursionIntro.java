/**
 * Created by michael_hopps on 2/26/18.
 */
public class RecursionIntro {

    /*
    RECURSION: when a method calls itself.

    Powerful, but dangerous!  Can use ALL the memory available
    very quickly.

    Check for an end case...
     */

    public static void main(String[] args) {
        permutations("");
    }

    public static void permutations(String word){
        permutations("", word);
    }
    public static void permutations(String prefix, String ending){
        if(ending.length() == 1)
            System.out.println(prefix + ending);
        else{
            for (int i = 0; i < ending.length(); i++) {
                String a = ending.substring(i, i+1);
                String b = ending.substring(0, i) + ending.substring(i+1);
                permutations(prefix + a, b);
            }
        }

    }



    //ASSUME no spaces or punctuation, all same case
    public static boolean isPalindrome(String s){
        if(s.length() <= 1)
            return true;
        if(s.substring(0, 1).equals( s.substring(s.length()-1) ))
            return isPalindrome(s.substring(1, s.length()-1));
        else
            return false;
    }

    //returns the sum of the digits of n
    //1452 -> 12
    public static int sumDigits(int n){
        if(n < 10)
            return n;
        return (n % 10) + sumDigits(n/10);
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int factorial(int n){
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }



}
