package TestProject.src.knowledgeTest.StringProgram;

/*
We define the following terms:
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
A<B<...<Y<Z<a<b...<y<z
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string.
For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string S and an integer K -
complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description -
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
 */

import java.util.Scanner;

public class SmallestAndLargestSubString {

    public static String getSmallestAndLargest(String s, int k) {
        String currStr = s.substring(0, k);
        String smallest = currStr;
        String largest = currStr;

        for(int i=k; i<s.length(); i++){
            currStr = currStr.substring(1, k)+s.charAt(i);
            if(currStr.compareTo(smallest)<0){
                smallest = currStr;
            }
            if(currStr.compareTo(largest)>0){
                largest = currStr;
            }
        }
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
