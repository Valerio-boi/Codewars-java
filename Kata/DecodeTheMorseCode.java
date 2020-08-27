public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String frase="";
        String [] morse = morseCode.split(" ");
       for(int i =0; i<morse.length; i++){
       frase+=MorseCode.get(morse[i]);
       System.out.println(morse[i]);
       }
       String []  frase1= frase.split("null");
       frase="";
        for(int e =0; e<frase1.length; e++){
       frase+=frase1[e] +" ";
       }
      frase= frase.replaceAll("\\s{2,}", " ").trim();
       return  frase;
    }
  }