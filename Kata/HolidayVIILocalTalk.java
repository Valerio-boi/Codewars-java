public class Kata {

  public static String pak(final String s) {
  if(s.matches(" {1,}")) return "";
    return s.replace(" ", " pak ");
  }
  
}