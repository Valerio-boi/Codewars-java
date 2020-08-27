import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    String numero = "" + num;
    String numero1="";
    int ne;
    ArrayList <Integer> numeri = new ArrayList<>();
    for(int i=0; i<numero.length(); i++){
    Integer n = Character.getNumericValue (numero.charAt(i));
      numeri.add(n);
    }
    Collections.sort(numeri,Collections.reverseOrder());
   
    for(int e=0; e<numeri.size(); e++){
      numero1+=numeri.get(e);
      System.out.println(numeri.get(e));
    }
    ne = Integer.parseInt(numero1);
     return ne; 
  }
}