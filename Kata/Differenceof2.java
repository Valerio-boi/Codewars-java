import java.util.ArrayList;
import java.util.Collections;
public class Kata {
  public static int[][] twosDifference(int[] array) {
       ArrayList<int[]> result = new ArrayList<>();
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
          arrayList.add(num);
        }
        
        Collections.sort(arrayList);
        for (int i1=0; i1 < arrayList.size(); i1++) {
        
          Integer int1 = arrayList.get(i1);
          for (int i2=i1; i2 < arrayList.size(); i2++) {
          
            Integer int2 = arrayList.get(i2);
            if ((int2 - int1) == 2) {
            
              result.add(new int[]{int1, int2});
            
            }
          }
        
        }
        return result.toArray(new int[result.size()][]);
  }
}