class Solution {

  public static String binaryToText(String binary) {
    String [] frase= new String[binary.length()];
    String parola="";
      if(binary.isEmpty()){
        return "";
      }
        for(int i=0; i<binary.length(); i+=8) {
          frase[i]=binary.substring(i, i+8);
        }
          for(int e=0; e<frase.length; e+=8) {
            parola+=(char)Integer.parseInt(frase[e],2);
          }
      return parola;
    }

  }