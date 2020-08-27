public class DRoot {
  public static int digital_root(int n) {
  String lunghezza = "" + n;
    int numero = 0;
    int[] numeri = new int[lunghezza.length()];
    if (n >= 0 && n < 10) {
      return n;
    }
    for (int l = 0; l < lunghezza.length(); l++) {
      numeri[l] = Integer.parseInt("" + lunghezza.charAt(l));
      numero += numeri[l];
    }
    return digital_root(numero);
  }
}