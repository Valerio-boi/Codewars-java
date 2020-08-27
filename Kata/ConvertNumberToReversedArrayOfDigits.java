public class Kata {
  public static int[] digitize(long n) {
    String num=""+ n;
    String inverso="";
    System.out.println(n);
    int [] numeroInverso = new int[num.length()];
    for(int i=num.length()-1; i>=0; i--){
    inverso+=num.charAt(i);
    }
    for(int e=0; e<numeroInverso.length; e++){
    numeroInverso[e]=Integer.parseInt("" +inverso.charAt(e));
    }
    System.out.println(inverso);
    return numeroInverso;
  }
}