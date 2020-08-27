class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
  boolean flag=false;
  if(a<b+c && b<a+c && c<b+a){
    flag=true;
  }
  System.out.println( "" + a + " " + b + " " + c);
   return flag;
 }
}