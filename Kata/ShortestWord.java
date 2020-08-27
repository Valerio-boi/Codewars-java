import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static int findShort(String s) {
          String[] stringa = s.split(" ");
    List<Integer> lunghezze = new ArrayList<>();
    for (int i = 0; i < stringa.length; i++) {
      lunghezze.add(stringa[i].length());
    }
    Collections.sort(lunghezze);
    return lunghezze.get(0);
    }
}