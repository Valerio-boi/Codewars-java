class Solution{
    public static String[] capitalize(String s){
              String frase="";
             String apoggio;
             String frase2="";
           for(int i=0; i<s.length(); i++) {
             apoggio= "" +s.charAt(i);
            if(i%2==1){
            frase2+=apoggio.toUpperCase();
            }else{
             frase2+=apoggio;
             }
             if(i%2==0) {
               frase+=apoggio.toUpperCase();
             }else {
               frase+=apoggio;
             }
           }
           System.out.println(frase);
           String [] f = new String[2];
           f[0]=frase;
           f[1]=frase2;
          return f;
    }
}