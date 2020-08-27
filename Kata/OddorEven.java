public class Codewars {
  public static String oddOrEven (int[] array) {
  int somma = 0;
    if(array.length==0){
    return "even";
    }
    for (int i = 0; i < array.length; i++) {
      somma += array[i];
    }
    if(somma%2==0) {
      return "even";
    }
    else return "odd";
  
  }
}