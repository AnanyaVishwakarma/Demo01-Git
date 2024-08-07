/*For this problem, we have 2 types of queries you can perform on a List:

Insert y at index x:

Insert
x y
Delete the element at index x:

Delete
x
Given a list, L,of N integers, perform Q queries on the list. Once all queries are completed, 
print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q(the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, 
and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, 
whose element must be deleted from L.
Constraints
1 <= N <= 4000
1 <= Q <= 4000


Each element in is a 32-bit integer.
Output Format

Print the updated list L as a single line of space-separated integers. */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();//no.of integers to be stored 
    
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
         n = scan.nextInt();
         for (int i = 0; i < n; i++) {
             String Q = scan.next();
             if (Q.compareTo("Insert")==0) {
                 list.add(scan.nextInt(), scan.nextInt());
             }else{
                 list.remove(scan.nextInt());
             }
         }
         for ( int i : list) {
             System.out.print(i + " ");
         }
        
    }
}
