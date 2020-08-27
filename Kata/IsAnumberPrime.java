public class Prime {
  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    } else {
      int nSquared = (int)Math.sqrt(num) + 1;
      for (int i = 2; i < nSquared; i++){
        if (num % i == 0){
          return false;
        }
      }
    }
    return true;
 }
}