import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
        String frase="";
      if(s.contains("_")) {
        String [] lowerToUpper = s.split("_");
        frase=lowerToUpper[0];
        for(int i=1; i<lowerToUpper.length; i++) {
         String appoggio=lowerToUpper[i];
         String lettera= "" + appoggio.charAt(0);
         frase+=lettera.toUpperCase()+appoggio.substring(1, appoggio.length());
        }
        System.out.println(frase);
      }else if(s.contains("-")) {
        String [] UpperCase = s.split("-");
        frase=UpperCase[0];
        for(int i=1; i<UpperCase.length; i++) {
           String appoggio=UpperCase[i];
           String lettera= "" + appoggio.charAt(0);
           frase+=lettera.toUpperCase()+appoggio.substring(1, appoggio.length());
          }
      }
        return frase;
  }
}