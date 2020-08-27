public class FindOdd {
  public static int findIt(int[] a) {
        int conta=0;
      for(int e=0; e<a.length; e++) {
        for(int i=0; i<a.length; i++) {
          if(a[e]==a[i]) {
            conta++;
          }
        }
        if(conta%2==1) {
          return a[e];
        }else {
          conta=0;
        }
      }
        return a[0];
  }
}