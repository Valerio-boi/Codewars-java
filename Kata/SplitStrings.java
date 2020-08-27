public class StringSplit {
  public static String[] solution(String s) {
    int dimensione = (int) Math.round((double) s.length()/2);
    String ultima;
    String [] divisione = new String[dimensione];
    String parola="";
    if(s.length()%2==0) {
      for(int i=0; i<s.length(); i+=2) {
        parola += s.substring(i, i+2) + ",";
      }
      divisione = parola.split(",");
    }else{
      String [] dispari = new String[dimensione];
      String modifica = s.substring(0, s.length()-1);
      ultima = s.charAt(s.length() -1) + "_";
      for(int i=0; i<modifica.length(); i +=2) {
        parola += modifica.substring(i,i+2) + ",";
      }
      divisione = parola.split(",");
      for(int i=0; i<divisione.length; i++) {
        dispari[i]=divisione[i];
      }
      dispari[dimensione -1] = ultima;
    return dispari;
    }
    return divisione;
  }
}