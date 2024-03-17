package syntax;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("World", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello World!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
