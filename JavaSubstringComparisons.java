/*We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
A < B < C...< Z < a < b < c ....< z.

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. 
For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string,'s', and an integer,'k' , complete the function so that it 
finds the lexicographically smallest and largest substrings of length 'k'.

Function Description:
-Complete the getSmallestAndLargest function in the editor below.
-getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting  */
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        for (int i = 0; i <s.length()-k+1; i++){ 
        if (s.substring(i,i+k).compareTo(smallest) <0) 
        smallest = s.substring(i, i+k); 
        if (s.substring(i,i+k).compareTo(largest) >0) 
        largest = s.substring(i,i+k); 
    }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
