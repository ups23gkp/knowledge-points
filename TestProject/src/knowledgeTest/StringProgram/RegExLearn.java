package TestProject.src.knowledgeTest.StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExLearn {

    public static void main(String[] args) {
        String str = "qwerAT!@";
        Pattern pattern = Pattern.compile("[A-Za-z !,?._'@]");
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Pattern is found in the given string.");
        } else System.out.println("Pattern is not found.");
    }
}
