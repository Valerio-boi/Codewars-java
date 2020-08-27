import java.util.HashMap;
public class Welcome {
  public static String greet(String language){
    HashMap <String, String> conversione = new HashMap<>();
    conversione.put("english", "Welcome"); conversione.put("czech", "Vitejte");
    conversione.put("danish", "Velkomst");  conversione.put("dutch", "Welkom");
    conversione.put("estonian", "Tere tulemast"); conversione.put("finnish", "Tervetuloa");
    conversione.put("flemish", "Welgekomen"); conversione.put("french", "Bienvenue");
    conversione.put("german", "Willkommen");  conversione.put("irish", "Failte");
    conversione.put("italian", "Benvenuto"); conversione.put("latvian", "Gaidits");
    conversione.put("lithuanian", "Laukiamas");  conversione.put("polish", "Witamy");
    conversione.put("spanish", "Bienvenido");  conversione.put("swedish", "Valkommen");
    conversione.put("welsh", "Croeso");

    if(conversione.containsKey(language)) {
      return conversione.get(language);
    }else {
      return "Welcome";
    }

  }
}