/*Generic methods are a very efficient way to handle multiple datatypes using a single method. 
This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray 
that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World
Do not use method overloading because your answer will not be accepted */
import java.io.*;
import java.util.*;

public class JavaGenerics {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
        }
      public static<T> void printArray(T[] element){
            for (T t : element) {
                System.out.println(t);
            }
        }

}

