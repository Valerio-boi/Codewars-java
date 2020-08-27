import java.util.List;
import java.util.ArrayList;
public class Order {
  public static String order(String words) {
    String p1 = null, p2= null, p3 = null, p4 = null, p5 = null, 
           p6 = null, p7 = null, p8 = null, p9 = null;
    List <String>listaDiControllo = new ArrayList<>();
    String ritorno="";
    String[] parole = words.split(" ");
      for(int i = 0; i<parole.length; i++) {
      if(parole[i].contains("1")) {
        p1 = parole[i];
      }else if(parole[i].contains("2")) {
        p2 = parole[i];
      }else if(parole[i].contains("3")) {
        p3 = parole[i];
      }else if(parole[i].contains("4")) {
        p4 = parole[i];
      }else if(parole[i].contains("5")) {
        p5 = parole[i];
      }else if(parole[i].contains("6")) {
        p6 = parole[i];
      }else if(parole[i].contains("7")) {
        p7 = parole[i];
      }else if(parole[i].contains("8")) {
        p8 = parole[i];
      }else if(parole[i].contains("9")) {
        p9 = parole[i];
      }
    }
      listaDiControllo.add(p1); listaDiControllo.add(p2); listaDiControllo.add(p3);listaDiControllo.add(p4);listaDiControllo.add(p5);
      listaDiControllo.add(p6); listaDiControllo.add(p7); listaDiControllo.add(p8) ; listaDiControllo.add(p9);
      for(int e=0; e< listaDiControllo.size(); e++) {
        if(listaDiControllo.get(e)!=null) {
          ritorno += listaDiControllo.get(e)+ " ";
        }
      }
      if(words.equals("")) {
        return "";
      }
    return ritorno.trim();
  }
}