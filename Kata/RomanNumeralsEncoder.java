import java.util.TreeMap;
public class Conversion {
  
  public static String solution(int n) {
    final TreeMap<Integer, String> numeriRomani = new TreeMap<Integer, String>();
    numeriRomani.put(1000, "M");
    numeriRomani.put(900, "CM");
    numeriRomani.put(500, "D");
    numeriRomani.put(400, "CD");
    numeriRomani.put(100, "C");
    numeriRomani.put(90, "XC");
    numeriRomani.put(50, "L");
    numeriRomani.put(40, "XL");
    numeriRomani.put(10, "X");
    numeriRomani.put(9, "IX");
    numeriRomani.put(5, "V");
    numeriRomani.put(4, "IV");
    numeriRomani.put(1, "I");
    Integer l = numeriRomani.floorKey(n);
    if (n == l) {
      return numeriRomani.get(n);
    }
    return numeriRomani.get(l) + solution(n - l);
  }
}