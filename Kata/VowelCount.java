import java.util.List;
import java.util.ArrayList;
public class Vowels {

  public static int getCount(String str) {
      List<String> vocali = new ArrayList<>();
    char[] stringa = str.toCharArray();
    vocali.add("a");
    vocali.add("e");
    vocali.add("i");
    vocali.add("o");
    vocali.add("u");
    int vowelsCount= 0;
    int conta = 0;
    for (int e = 0; e < vocali.size(); e++) {
      for (int i = 0; i < stringa.length; i++) {
        String lettera = "" + stringa[i];
        if (lettera.equals(vocali.get(e))) {
          vowelsCount++;
        }
      }
    }
    return vowelsCount;
  }
}