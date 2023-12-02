package TestProject.src.knowledgeTest.StringProgram;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    public boolean isPallindrome(String s){
        boolean flag;
        String reversedString = "";

        //s = madam modem

        for(int i=s.length()-1; i>=0; i--){
            reversedString = reversedString + s.charAt(i);
        }

        if(s.equals(reversedString)){
            System.out.println("The string is palindrome");
            flag = true;
        } else {
            System.out.println("The string is not a palindrome.");
            flag = false;
        }
        return flag;
    }

    public boolean isAnagram(String a, String b){

        Map<Character, Integer> hMapA = new HashMap<>();
        Map<Character, Integer> hMapB = new HashMap<>();

        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i=0; i<a.length(); i++){

           if(hMapA.containsKey(a.charAt(i))){
                hMapA.put(a.charAt(i), hMapA.get(a.charAt(i))+1 );
            } else{
               hMapA.put(a.charAt(i), 1);
           }
        }

        for(int j=0; j<b.length(); j++){

            if(hMapB.containsKey(b.charAt(j))){
                hMapB.put(b.charAt(j), hMapB.get(b.charAt(j))+1 );
            } else{
                hMapB.put(b.charAt(j), 1);
            }
        }

        System.out.println(hMapA);
        System.out.println(hMapB);

        if(hMapA.equals(hMapB)){
            System.out.println("Both strings are anagram");
            return true;
        } else
            System.out.println("Both strings are not anagram");
        return false;
    }

    public void tokenExtractor(String str){

    }
}
