import java.util.ArrayList;
import java.util.List;
class Solution {
    public static String camelCase(String input) {
 return input.replaceAll(
            String.format("%s|%s|%s",
               "(?<=[A-Z])(?=[A-Z][a-z])",
               "(?<=[^A-Z])(?=[A-Z])",
               "(?<=[A-Za-z])(?=[^A-Za-z])"
            ),
            " "
         );
      }
}