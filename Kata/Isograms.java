public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
        int conta = 0;
        System.out.println(str);
    char[] iso = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      for (int e = 0; e < str.length(); e++) {
        String lettera = " " + str.charAt(i);
        if (lettera.equalsIgnoreCase(" " + iso[e])) {
          conta++;
        }
      }
      if (conta >= 2) {
        return false;
      } else {
        conta = 0;
      }
    }
    return true;
    } 
}