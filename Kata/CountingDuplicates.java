import java.util.List;
import java.util.ArrayList;
public class CountingDuplicates {
  public static int duplicateCount(String in) {
    // Write your code here
  java.util.ArrayList<Character> duplicateLetters = new java.util.ArrayList<>();
    java.util.List<Character> arr = java.util.Arrays.asList(
            in.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .toArray(Character[]::new));
    for (char ch : in.toCharArray()) {
      if (java.util.Collections.frequency(arr, ch) > 1) {
        if (!duplicateLetters.contains(ch)) { duplicateLetters.add(ch); }
      }
    }
    return duplicateLetters.size();
  }
}