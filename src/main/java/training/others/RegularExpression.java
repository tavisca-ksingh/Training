package training.others;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String subjectString= "This is a string that \"will be\" highlighted when your 'regular expression'";
        List<String> matchList = new ArrayList<>();
        Pattern regex = Pattern.compile("[^\\s\"']+|\"[^\"]*\"|'[^']*'");
        Matcher regexMatcher = regex.matcher(subjectString);
        while (regexMatcher.find()) {
            matchList.add(regexMatcher.group());
        }
        System.out.println(matchList);
    }
}
