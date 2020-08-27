public class GreetMe{
  public static String greet(String name){
    return "Hello " + ((String) name.subSequence(0, 1)).toUpperCase() + name.substring(1).toLowerCase() +"!";
  }
}